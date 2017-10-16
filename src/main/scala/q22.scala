object q22 {
  def rangeR(m:Int,n:Int):List[Int] = List.range(m,n+1)

  def rangeR1(m:Int , n:Int):List[Int] = {
    if (m<n) m::rangeR1(m+1,n)
    else List(m)
  }

  def main(args: Array[String]): Unit = {
    print("List of number from 4 to 16 is : " + rangeR1(4,16))
  }
}
