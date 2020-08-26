

object patternMatching extends App {
  //this is kind of switch in scala
  def greekAlphabet(letter: Char) = {
    letter match {
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
        //add a default case with underscore character which is a wild card
      case _ => println("You entered an invalid character")
    }
  }
  println("Greek leter for A is "+ greekAlphabet('C'))
  
  
  def max(x:Int, y:Int) =  x> y match{
    case true => x
    case false => y
  }
  println(max(10, 50))
}