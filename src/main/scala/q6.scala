//Example:
//scala> isPalindrome(List(1, 2, 3, 2, 1))
//res0: Boolean = true
object q6 {

  def isplaindrome[A](ls:List[A]): Boolean = ls match{
    case Nil     => true
    case h:: Nil => true
    case h:: tail => h == tail.last && isplaindrome(tail.take(tail.length-1))
  }

  def main(args: Array[String]): Unit = {
    val ls1  = List(1,2,3,4)
    val ls2 = List(1,2,1)
    val ls3 = List(1,2,2,1)

    println(isplaindrome(ls1)+"  "+isplaindrome(ls2)+" "+isplaindrome(ls3))
  }
}
