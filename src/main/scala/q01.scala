//Example:
//scala> last(List(1, 1, 2, 3, 5, 8))
//res0: Int = 8
object q01 {
  def lastBuiltIn[A](ls: List[A]) : A = ls.last


  def recursiveLast[A](ls:List[A]) : A = ls match {
    case h :: Nil  => h
    case _ :: tail => recursiveLast(tail)
    case _         => throw new NoSuchElementException
  }

  def main(args:Array[String]): Unit ={
    val ls = List(1,2,3,4,5,6,7,8,9)

    println("Last using built in : "+ lastBuiltIn(ls) +
            "\nlast built in using function : " + recursiveLast(ls))
  }
}