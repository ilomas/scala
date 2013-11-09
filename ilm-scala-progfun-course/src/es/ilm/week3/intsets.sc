package es.ilm.week3

object intsets {
  val tree1 = new NonEmpty(3, Empty, Empty)       //> tree1  : es.ilm.week3.NonEmpty = {.3.}
  val t2 = tree1 incl 4                           //> t2  : es.ilm.week3.IntSet = {.3{.4.}}
  val t3 = t2 incl 2                              //> t3  : es.ilm.week3.IntSet = {{.2.}3{.4.}}
  val t4 = t3 incl 7                              //> t4  : es.ilm.week3.IntSet = {{.2.}3{.4{.7.}}}
  val t5 = t4 incl 6                              //> t5  : es.ilm.week3.IntSet = {{.2.}3{.4{{.6.}7.}}}

  val t6 = new NonEmpty(17, Empty, Empty)         //> t6  : es.ilm.week3.NonEmpty = {.17.}
  val t7 = t6 incl 22                             //> t7  : es.ilm.week3.IntSet = {.17{.22.}}
  val t8 = t5 union t7                            //> t8  : es.ilm.week3.IntSet = {{{.2{{.3.}4.}}6{.7.}}17{.22.}}
  
  t8 contains(12)                                 //> res0: Boolean = false
  t8.contains(17)                                 //> res1: Boolean = true
}