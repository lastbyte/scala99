object q7 {


  def flatten(ls: List[Any]): List[Any] = ls flatMap{
    case ms: List[_] => flatten(ms)
    case e           => List(e)
  }

  def main(args: Array[String]): Unit = {
    val ls  = List(List(1,2),3,List(List(4,5),List(6,7)))
    println(flatten(ls))
  }
}