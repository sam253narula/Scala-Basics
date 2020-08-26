object arrayExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(65); 
  println("Welcome to the Scala worksheet");$skip(32); 
  var nums = new Array[Any](10);System.out.println("""nums  : Array[Any] = """ + $show(nums ));$skip(54); 
  var furniture = Array("chair","sofa","table","bed");System.out.println("""furniture  : Array[String] = """ + $show(furniture ));$skip(33); 
  for(f <- furniture) println(f);$skip(23); 
	println(furniture(0));$skip(27); 
	var a  = Array(1,2,3,4,5);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(37); 
	var result  = for(n <- a) yield 2*n;System.out.println("""result  : Array[Int] = """ + $show(result ));$skip(47); 
  var  even  = for(n <- a if n%2 == 0) yield n;System.out.println("""even  : Array[Int] = """ + $show(even ))}
  
  
}
