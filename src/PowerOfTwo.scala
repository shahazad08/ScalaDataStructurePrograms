import PrimeFactors.isValidInput

object PowerOfTwo extends App {
  //input the number from the user
  print("Enter the Power")
  var input=scala.io.StdIn.readInt()

  def isValidInput(input:Int)= {
    input>=0 && input<=31
  }
  def printTable(input:Int)= {
    for(power <- 0 to input) {
      println("2^" + power + "=" + Math.pow(2,power))
    }
  }
  //print the table if the input is valid
  if(isValidInput(input)){
   printTable(input)
  }
  else {
    println("Input is Invalid")
  }
}
