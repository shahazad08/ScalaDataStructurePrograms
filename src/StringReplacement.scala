object StringReplacement extends App {
  val userMessage:String="Hello <<>>, how r u?"

  println("Whats ur Name?")
  val userName:String=scala.io.StdIn.readLine()

  // Input atleast 3 Chars
  if(userName.length()<=3){
    println("Enter Valid Input")
  }
  else {
     //Replace all parts of String that match with regex
     val display=userMessage.replaceAll("<<[\\s\\S]*>>", userName);
    print(display)

  }
}
