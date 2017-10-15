object q8 {

  def deleteConsecutiveDuplicate[A](ls:List[A]):List[A] = ls match {
    case Nil       => Nil
    case h :: tail => h :: deleteConsecutiveDuplicate(tail.dropWhile(_ == h))
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1,1,2,3,3,4,4,4,4,5,5,5,5,5,5,6,6,6)
    println(deleteConsecutiveDuplicate(ls))
  }
}
