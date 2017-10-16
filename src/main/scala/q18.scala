object q18 {
  def extractSlice[A](ls: List[A], m:Int, n:Int):List[A] = ls.slice(m,n)


  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,5,6,7,8,9)
    println("Get Slice of list : " + extractSlice(ls,3,7));
  }
}
