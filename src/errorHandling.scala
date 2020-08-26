import java.io._
import io.Source._
object errorHandling extends App {
  try {
    for(line <- fromFile("nofile.txt").getLines())
    println(line)
  } catch {
    //case t: Throwable => t.printStackTrace() // TODO: handle error
    case e:FileNotFoundException => println("The file was not found!")
    case _:Exception  => println("your program had an error")
  }
    try{
      var q = 10/0
    }
    catch {
      case e: ArithmeticException => println("dont devide by 0") // TODO: handle error
    }
  
    
}