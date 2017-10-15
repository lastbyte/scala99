//Example:
//scala> reverse(List(1, 1, 2, 3, 5, 8))
//res0: List[Int] = List(8, 5, 3, 2, 1, 1)
object q5 {

  def reverseList[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => reverseList(tail) ::: List(h)
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,5)
    println("reverse of "+ ls + " is : " + reverseList(ls))
  }
}
