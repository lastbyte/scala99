object q21 {
  def insertAt[A](e:A , n:Int , ls:List[A] ) : List[A] = {

    if (ls.isEmpty || n<0 || n>ls.size) Nil
    val (pre,post) = ls.splitAt(n)
    pre:::List(e):::post
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,5,6,7)
    println("List after inserting element at position 4 : " + insertAt(4,3,ls))
  }
}
