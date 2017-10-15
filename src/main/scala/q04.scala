//Example:
//scala> length(List(1, 1, 2, 3, 5, 8))
//res0: Int = 6
object q04 {

  def lenUtil[A](ls:List[A],size:Int):Int = ls match{

    case Nil      => size
    case _ ::tail => lenUtil(tail,size+1)
  }

  def len[A](ls:List[A]):Int = lenUtil(ls,0)


  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,5,6,7)
    println("Size of the " + ls + " is : " + len(ls))
  }
}
