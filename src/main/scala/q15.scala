object q15 {
  def duplicateNTimes[A](ls: List[A], n:Int):List[A] = {
    ls flatMap{ e => List.fill(n)(e)}
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4)
    println("duplicated list is : " + duplicateNTimes(ls,3))
  }
}
