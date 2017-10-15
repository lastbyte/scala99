object Q5 {

  def reverseList[A](ls: List[A]): List[A] = ls match {
    case Nil       => Nil
    case h :: tail => reverseList(tail) ::: List(h)
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,5)
    println("reverse of "+ ls + " is : " + reverseList(ls))
  }
}
