object OperatorWorksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  println("Welcome to the Scala worksheet");$skip(13); 
  var x  = 3;System.out.println("""x  : Int = """ + $show(x ));$skip(11); 
  var y =9;System.out.println("""y  : Int = """ + $show(y ));$skip(17); 
  var sum =  x+y;System.out.println("""sum  : Int = """ + $show(sum ));$skip(19); 
  var  andOp = x&y;System.out.println("""andOp  : Int = """ + $show(andOp ));$skip(17); 
  var orOp = x|y;System.out.println("""orOp  : Int = """ + $show(orOp ));$skip(19); 
  var exOrOp = x^y;System.out.println("""exOrOp  : Int = """ + $show(exOrOp ));$skip(19); 
  
  var b4 = x<<2;System.out.println("""b4  : Int = """ + $show(b4 ));$skip(29); 
  val nums = 1::2::3::4::Nil;System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(51); val res$0 = 
  
  if(x > 0 || y > 0) "BOTH VALUES ARE POSITIVE";System.out.println("""res0: Any = """ + $show(res$0))}
  
}
