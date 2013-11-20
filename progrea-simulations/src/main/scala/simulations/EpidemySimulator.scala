package simulations

import math.random

class EpidemySimulator extends Simulator {

  def randomBelow(i: Int) = (random * i).toInt

  protected[simulations] object SimConfig {
    val population: Int = 300
    val roomRows: Int = 8
    val roomColumns: Int = 8

    // to complete: additional parameters of simulation
    val timepoIncubacion = 6
    val tiempoMuerte = 14
    val tiempoInmune = 16
    val tiempoCura = 18
    val probabilidadSupervivencia = 0.01
    val probabilidadContagio = 0.4
    val probabilidadMuerte = 0.25
  }

  import SimConfig._

  val persons: List[Person] = for {
    i <- (0 until population).toList
  } yield {
    val p = new Person(i)
    if (i < population * probabilidadSupervivencia)
      p.setInfectada()
    p.mode()
    p
  }

  class Person(val id: Int) {
    var infected = false
    var sick = false
    var immune = false
    var dead = false

    // demonstrates random number generation
    var row: Int = randomBelow(roomRows)
    var col: Int = randomBelow(roomColumns)

    //
    // to complete with simulation logic
    //
    def setInfectada() {
      infected = true
      afterDelay(timepoIncubacion)(setEnferma)
      afterDelay(tiempoMuerte)(setMuerta)
      afterDelay(tiempoInmune)(setImmune)
      afterDelay(tiempoCura)(setSana)
    }

    def setEnferma() {
      sick = true
    }

    def setMuerta() {
      if (random < probabilidadMuerte)
        dead = true
    }

    def setImmune() {
      if (dead)
        return
      sick = false
      immune = true
    }

    def setSana() {
      if (dead)
        return
      immune = false
      infected = false
    }

    def mode() {
      val moveDelay = randomBelow(5) + 1
      afterDelay(moveDelay)(movimiento)
    }

    def movimiento() {
      if (dead)
        return
      //// Movimiento a la habitacion vecinal
      val vecinos = List(((row - 1 + roomRows) % roomRows, col),
        ((row + 1) % roomRows, col),
        (row, (col - 1 + roomColumns) % roomColumns),
        (row, (col + 1) % roomColumns))

      def isSano(room: (Int, Int)): Boolean = room match {
        case (r, c) => (persons.find { p => p.row == r && p.col == c && (p.sick || p.dead) }).isEmpty
      }

      val candidato = vecinos filter isSano
      if (!candidato.isEmpty) {
        val candidate: (Int, Int) = candidato(randomBelow(candidato.length))
        candidate match {
          case (a, b) => row = a; col = b
        }
      }
      //// Nos infectamos si alguien en la misma habitacion esta infectado y aun no esta inmune ni infectada
      if (!immune && !infected)
        if (random < probabilidadContagio)
          if (!(persons.find { p => p.row == row && p.col == col && p.infected }).isEmpty)
            setInfectada()

      //// Siguiente movimiento
      mode()
    }
  }
}
