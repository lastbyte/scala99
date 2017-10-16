//     Implement the so-called run-length encoding data compression method
//     directly.  I.e. don't use other methods you've written (like P09's
//     pack); do all the work directly.
//
//     Example:
//     scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//     res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
object q13 {

  def directEncode[A](ls: List[A]): List[(A,Int)] ={
    if (ls.isEmpty){
      Nil
    }
    else {
      val (pack, tail) = ls span {
        _ == ls.head
      }
      (pack.head, pack.length) :: directEncode(tail)
    }
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,1,1,1,2,2,3,3,3,4,5,5,5,6,6,6,6)
    println("Encoded list is : " + directEncode(ls))
  }
}
