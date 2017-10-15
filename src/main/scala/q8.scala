//If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
//  Example:
//
//scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
object q8 {

  def deleteConsecutiveDuplicate[A](ls:List[A]):List[A] = ls match {
    case Nil       => Nil
    case h :: tail => h :: deleteConsecutiveDuplicate(tail.dropWhile(_ == h))
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1,1,2,3,3,4,4,4,4,5,5,5,5,5,5,6,6,6)
    println(deleteConsecutiveDuplicate(ls))
  }
}
