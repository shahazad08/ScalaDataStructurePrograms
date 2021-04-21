import scala.util.Random

object FlipCoin extends App {

  var coinTossCount:Int=0
  println("Enter the Coin Flip Count")
  val flipCount=scala.io.StdIn.readInt();

  def coinFlip():Int={
    var r=scala.util.Random
    coinTossCount+=1
    r.nextInt(2)
  }
  var numberOfHeads:Int=0
  for(i<-1 to flipCount) {
    numberOfHeads+=coinFlip()
  }
  val numberOfTails:Int=flipCount-numberOfHeads

  //Display with the percentages
  println("Percentage for Heads: " + numberOfHeads * 100 / flipCount + "%")
  println("Percentage for Tails: " + numberOfTails * 100 / flipCount + "%")

}
