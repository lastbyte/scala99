object q14 {
  def duplicate[A](ls: List[A]):List[A] = {
    ls flatMap{ e => List.fill(2)(e)}
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1,2,3,4,4)
    println("Duplicated list is : " + duplicate(ls))
  }
}
