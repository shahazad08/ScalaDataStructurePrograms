import scala.reflect.io.File

object Utilities {
  def readFile(filePath:String) :Array[String]= {
    val file=File(filePath)
    val reader=file.bufferedReader()
    reader.readLine().split(",").map(_.trim)
  }
}
