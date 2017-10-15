//By convention, the first element in the list is element 0.
//Example:
//
//scala> nth(2, List(1, 1, 2, 3, 5, 8))
//res0: Int = 2
object q03 {

    def nth[A](n:Int, ls : List[A]):A = (n,ls) match{
      case (0, h   :: _   ) => h
      case (n, h :: tail) => nth(n-1,tail)
      case (_, Nil        ) => throw new NoSuchElementException
    }

  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,5,6,7)
    println("4th element of "+ls+" is : " + nth(4,ls) )
  }
}
