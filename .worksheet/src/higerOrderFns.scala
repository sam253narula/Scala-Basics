object higerOrderFns {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(33); 
  val double = (i: Int) => i * 2;System.out.println("""double  : Int => Int = """ + $show(double ));$skip(199); 
  //: Int => Int) in below line simple means any function that takes in a Int and returns a Int
  //one function take another function as input below:
  def higherorder(x: Int, y: Int => Int) = y(x);System.out.println("""higherorder: (x: Int, y: Int => Int)Int""");$skip(25); val res$0 = 
  higherorder(6, double);System.out.println("""res0: Int = """ + $show(res$0));$skip(36); 
  
  val triple = (x: Int) => x * 3;System.out.println("""triple  : Int => Int = """ + $show(triple ));$skip(56); 
  def higerOrderFunTriple(a: Int, b: Int => Int) = b(a);System.out.println("""higerOrderFunTriple: (a: Int, b: Int => Int)Int""");$skip(33); val res$1 = 
  higerOrderFunTriple(3, triple);System.out.println("""res1: Int = """ + $show(res$1));$skip(67); 

  def sayHello = (name: String) => {
    "Hello" + " " + name
  };System.out.println("""sayHello: => String => String""");$skip(32); 
  var message = sayHello("sam");System.out.println("""message  : String = """ + $show(message ));$skip(15); 
  
  var y = 5;System.out.println("""y  : Int = """ + $show(y ));$skip(34); 
  val multiplier = (x:Int) => x*y;System.out.println("""multiplier  : Int => Int = """ + $show(multiplier ));$skip(17); val res$2 = 
  multiplier(10);System.out.println("""res2: Int = """ + $show(res$2))}
  
}
