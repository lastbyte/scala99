object q17 {
  def splitList[A](ls:List[A], n:Int):List[List[Any]] = {
    List(ls.take(n)) :: List(ls.takeRight(ls.size-n))
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1,2,3,4,5,6,7,8)
    println("split List is : " + splitList(ls,3))
  }
}
