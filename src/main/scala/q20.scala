object q20 {
  def removeAt[A](n: Int, ls: List[A]): (List[A], A) = {
    if (ls.isEmpty) throw new NoSuchElementException
    else {
      val (pre, post) = ls.splitAt(n)
      ((pre ::: post.tail), post.head)
    }
  }



  def main(args: Array[String]): Unit = {
    var ls = List(1,2,3,4,5,6,7,8)
    println("Tuple after removing element from the List : " + removeAt(3,ls))
  }
}
