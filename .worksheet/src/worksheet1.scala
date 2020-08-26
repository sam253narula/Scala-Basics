object worksheet1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(63); 
  println("Welcome to the Scala worksheet");$skip(64); 
  //dynamically typed language auto infers data type
  var x =5;System.out.println("""x  : Int = """ + $show(x ));$skip(29); 
  var str  = "scala is cool";System.out.println("""str  : String = """ + $show(str ));$skip(74); 
  //To create mutable list use below syntax
  var odds  = List(1,2,3,4,5);System.out.println("""odds  : List[Int] = """ + $show(odds ));$skip(55); val res$0 = 
  //To create immuable list use below syntax
  2 to 10;System.out.println("""res0: scala.collection.immutable.Range.Inclusive = """ + $show(res$0));$skip(49); 
 // mutable varaiable declaration
  var y = true;System.out.println("""y  : Boolean = """ + $show(y ));$skip(54); 
  //Immutable variable declaration
  val pi = 3.14159;System.out.println("""pi  : Double = """ + $show(pi ));$skip(65); 
  //Inline function definition
  def add(a:Int,b:Int): Int = a+b;System.out.println("""add: (a: Int, b: Int)Int""");$skip(11); val res$1 = 
  add(4,9);System.out.println("""res1: Int = """ + $show(res$1));$skip(261); 
/*automatic type inferance based on data type hirarchy, Any is the parent of all type in scala,
  like we have object as aprent of all classes in java,
  there are no primitive data types in scala, all datatypes are classes */
  var list1  = List(1,true,"sam");System.out.println("""list1  : List[Any] = """ + $show(list1 ));$skip(27); 
  var list2 = List(1,true);System.out.println("""list2  : List[AnyVal] = """ + $show(list2 ));$skip(25); 
  var c  = 10.toString();System.out.println("""c  : String = """ + $show(c ));$skip(19); 
  var b= 10.to(20);System.out.println("""b  : scala.collection.immutable.Range.Inclusive = """ + $show(b ));$skip(20); 
  var e = 10. +(11);System.out.println("""e  : Int = """ + $show(e ));$skip(20); 
  var f = 97.toChar;System.out.println("""f  : Char = """ + $show(f ))}
  
}
