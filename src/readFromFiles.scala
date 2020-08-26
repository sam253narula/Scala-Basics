
import io.Source._


object readFromFiles extends App {
  val fileName ="src/colors"
  for(line <- fromFile(fileName).getLines() ){
    println(line)
  }
  val colors = fromFile(fileName).getLines().toList
  colors.foreach(color => println(color))
   colors.foreach(color => println)
  for(line <- fromFile(fileName).getLines()){
    println()
  }
    
    
    
}