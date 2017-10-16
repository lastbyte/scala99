object q16 {
  def dropEveryNth[A](ls: List[A], n:Int) : List[A] = {
    ls.zipWithIndex filter{ v  => (v._2 + 1 ) % n != 0 } map { _._1 }
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1,2,3,4,5,6,7,8,9)
    println("list after deleting every 3rd element : "+dropEveryNth(ls,3))
  }
}
