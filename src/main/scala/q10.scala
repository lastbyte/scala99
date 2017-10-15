//Use the result of problem q9 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
//Example:
//
//scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
object q10 {

  def lengthEncoding[A](ls:List[A]):List[(A,Int)] = {
    q09.consecutiveDuplicateSubList(ls) map{ e => (e.head , e.length) }
  }

  def main(args: Array[String]): Unit = {
    var ls = List(1,1,2,2,2,3,3,3,3,3,3,4,5,5,6,6)
    println("encoded list is : " + lengthEncoding(ls))
  }
}
