//If a list contains repeated elements they should be placed in separate sublists.
//  Example:
//scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
object q9 {

  def consecutiveDuplicateSubList[A](ls:List[A]):List[List[A]] = {
    if(ls.isEmpty) {
      List (List())
    }
    else{
      val (subList,list) = ls span { _ == ls.head}
      if (list == Nil){
        List(subList)
      }
      else{
        subList::consecutiveDuplicateSubList(list)
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val ls = List(1,1,2,2,2,3,3,3,4,5,5,5,6,7,7,8,8,8)
    println("packed list are : "+consecutiveDuplicateSubList(ls))
  }
}
