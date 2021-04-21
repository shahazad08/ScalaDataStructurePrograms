object PrimeFactors extends App {
  println("Enter the Number")
  val number:Int=scala.io.StdIn.readInt()

  def isValidInput():Boolean={
    number >1
  }

  def isPrime(input: Int): Boolean = {
    for (i <- 2 until input) {
      if (input % i == 0)
        return false
    }
    true
  }
  def primeFactors(i: Int)={
    for (i <- 2 to i) {
      if (i % i == 0 && isPrime(i)) {
        print(i + " ")
      }
    }
  }
  if(isValidInput()) {
    primeFactors(number)
    print("Proper Nos")
  }
  else {
    println("Invalid")
  }
}
