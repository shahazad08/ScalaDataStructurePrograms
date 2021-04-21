class ArrayExample {
  var arr=Array.ofDim[Int](2,2)
  arr(1)(0)=10

  def show(): Unit = {
    for(i <-0 to 1){
      for(j <-0 to 1) {
        print(" "+arr(i)(j))
      }
      println()
    }
  }
}


object MultidimensionalArray extends App {
  var a=new ArrayExample()
  a.show()
}
