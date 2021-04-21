object LeapYear extends App {
  print("Enter the Year");
  val year:Int=scala.io.StdIn.readInt()
  println("Year is %d", year)

  def isLeapYear(year:Int) :Boolean = {
    (year%4==0 && year%100 !=0) || year%400==0
  }
  if(isLeapYear(year)){
    println("Year is a Leap Year")
  }
  else {
    println("Year is Not a leap year")
  }
}
