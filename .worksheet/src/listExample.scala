
object listExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(52); 
  var l = List(2.0, 3, 5, 'a');System.out.println("""l  : List[Double] = """ + $show(l ));$skip(71); 
  //cons operator for creating list
  var l2 = 1 :: 2 :: 3 :: 4 :: Nil;System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(30); 
  var l3 = List.range(10, 20);System.out.println("""l3  : List[Int] = """ + $show(l3 ));$skip(20); 
  var l4 = l ::: l2;System.out.println("""l4  : List[AnyVal{def getClass(): Class[_ >: Int with Double <: AnyVal]}] = """ + $show(l4 ));$skip(14); 
  var sum = 0;System.out.println("""sum  : Int = """ + $show(sum ));$skip(23); 
  l3.foreach(sum += _);$skip(15); 
  println(sum);$skip(68); 
  //list of tuples below:
  val listOfTuples = List((1, 2), (3, 4));System.out.println("""listOfTuples  : List[(Int, Int)] = """ + $show(listOfTuples ));$skip(43); val res$0 = 
  for ((a, b) <- listOfTuples) yield a + b;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(107); 

  //Home work on list, create a alist find al aggregate function results
  var nums = List(1, 2, 3, 4, 5);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(109); 

  def avg(a: Array[Int]): Double = {
    var sum = 0
    for (v <- a) yield sum += v
    sum / a.length
  };System.out.println("""avg: (a: Array[Int])Double""");$skip(94); 
  var min = (a: Array[Int]) => {
    var m = a(0)
    for (v <- a) if (v < m) m = v
    m
  };System.out.println("""min  : Array[Int] => Int = """ + $show(min ));$skip(94); 
  var max = (a: Array[Int]) => {
    var m = a(0)
    for (v <- a) if (v > m) m = v
    m
  };System.out.println("""max  : Array[Int] => Int = """ + $show(max ));$skip(52); 

  var numArray = Array(10, 20, 35, 4, 34, 45, 100);System.out.println("""numArray  : Array[Int] = """ + $show(numArray ));$skip(42); 
  println("Average is: " + avg(numArray));$skip(44); 
  println("Min value is: " + min(numArray));$skip(44); 
  println("Max value is: " + max(numArray))}

}
