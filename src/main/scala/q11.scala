//Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.
//Example:
//
//scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))


object q11 {
  def modifiedEncoding[A](ls:List[A]):List[Any] = {
    q10.lengthEncoding(ls) map { e => if (e._2 == 1) e._1 else e}
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,2,3,4,4,4,4,5,5,5,5,5,5,6,6,7,7,7,8)
    println("Modified encoded List is : "+ modifiedEncoding(ls))
  }
}
