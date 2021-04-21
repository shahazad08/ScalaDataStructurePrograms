import scala.util.control.Breaks

object LinearSearch {
  def main(args: Array[String]): Unit = {
    var arr= Array(10,20,30,40,50)
    println("Enter the Key")
    var key:Int=scala.io.StdIn.readInt()

    for(i <- 0 to arr.length-1) {
      if(key==arr(i)){
        println("Element is Found")
      }
      else {
        println("Element is not Found")
      }
    }

  }
}
