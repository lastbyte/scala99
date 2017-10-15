//Example:
//scala> penultimate(List(1, 1, 2, 3, 5, 8))
//res0: Int = 5
object q02 {
  def secondLast[A](ls:List[A]):A = ls match {
    case h :: _    :: Nil => h
    case _ :: tail        => secondLast(tail)
    case _                => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,5,6,7,8)
    println("Second last element : "+ secondLast(ls))
  }
}
