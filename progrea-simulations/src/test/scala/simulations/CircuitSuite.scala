package simulations

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CircuitSuite extends CircuitSimulator with FunSuite {
  val InverterDelay = 1
  val AndGateDelay = 3
  val OrGateDelay = 5

  test("andGate example") {
    val in1, in2, out = new Wire
    andGate(in1, in2, out)
    in1.setSignal(false)
    in2.setSignal(false)
    run

    assert(out.getSignal === false, "and 1")

    in1.setSignal(true)
    run

    assert(out.getSignal === false, "and 2")

    in2.setSignal(true)
    run

    assert(out.getSignal === true, "and 3")
  }

  test("orGate example") {
    val in1, in2, out = new Wire

    in1.setSignal(true)
    in2.setSignal(false)
    orGate(in1, in2, out)
    run

    assert(out.getSignal === true, "true 1")

    in2.setSignal(true)
    run

    assert(out.getSignal === true, "both true")

    in1.setSignal(false)
    run

    assert(out.getSignal === true, "true 2")

    in2.setSignal(false)
    run

    assert(out.getSignal === false, "both false")
  }

  test("demux example") {
    val in, c1, c2, c3, c4 = new Wire
    val o1, o2, o3, o4, o5, o6, o7, o8 = new Wire
    in.setSignal(true)

    c1.setSignal(true)
    c2.setSignal(false)
    c3.setSignal(false)

    val c: List[Wire] = List(c1, c2, c3)
    val out: List[Wire] = List(o1, o2, o3, o4, o5, o6, o7, o8)

    demux(in, c, out)
    run
    assert(out(3).getSignal === true, "100 true 3")
    
    c1.setSignal(false)
    c2.setSignal(true)
    c3.setSignal(true)
    
    demux(in, c, out)
    run
    assert(out(4).getSignal === true, "011 true 4")
  }
}
