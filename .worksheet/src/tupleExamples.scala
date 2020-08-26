object tupleExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(28); 
  val v = (1, 1.4, "Hello");System.out.println("""v  : (Int, Double, String) = """ + $show(v ));$skip(15); 
  var x = v._3;System.out.println("""x  : String = """ + $show(x ));$skip(33); 
  val (first, second, third) = v;System.out.println("""first  : Int = """ + $show(first ));System.out.println("""second  : Double = """ + $show(second ));System.out.println("""third  : String = """ + $show(third ));$skip(38); 

  val symbols = Array("<", "-", ">");System.out.println("""symbols  : Array[String] = """ + $show(symbols ));$skip(31); 
  val counts = Array(2, 10, 2);System.out.println("""counts  : Array[Int] = """ + $show(counts ));$skip(34); 
  val pairs = symbols.zip(counts);System.out.println("""pairs  : Array[(String, Int)] = """ + $show(pairs ));$skip(37); 
  for ((s, n) <- pairs) print(s * n);$skip(12); 
  println();$skip(60); 
  def divide10(n: Int): Tuple2[Int, Int] = (n / 10, n % 10);System.out.println("""divide10: (n: Int)(Int, Int)""");$skip(34); 
  val (tens, ones) = divide10(99);System.out.println("""tens  : Int = """ + $show(tens ));System.out.println("""ones  : Int = """ + $show(ones ))}
  
  
}
