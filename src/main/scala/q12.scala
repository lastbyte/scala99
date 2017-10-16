//Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
//
//Example:
//
//scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
//res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

object q12 {

    def decode[A](ls: List[(A,Int)]):List[A] = {
      ls flatMap{ e => List.make(e._2,e._1)}
    }

    def main(args: Array[String]): Unit = {
      var ls = List((1,4),(2,1), (3,2), (4,5))

      println("decoded list is : "+decode(ls))
   }
}
