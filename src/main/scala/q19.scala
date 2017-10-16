object q19 {
  def rotateList[A](ls:List[A], n:Int) : List[A] = if (ls.isEmpty) Nil else if (n>0) ls.takeRight(ls.size-n):::ls.take(n) else ls.takeRight(-n):::ls.take(ls.size+n)

  def main(args: Array[String]): Unit = {
    val ls = List('a','b','c','d','e','f','g','h')
    println("Rotated List is : " + rotateList(ls,-2))
  }
}
