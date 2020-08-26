object setWorksheets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(66); 
  println("Welcome to the Scala worksheet");$skip(39); 
   val fruits = Set("apple", "banana");System.out.println("""fruits  : scala.collection.immutable.Set[String] = """ + $show(fruits ));$skip(29); 
  var  nums = Set(1,2,3,4,5);System.out.println("""nums  : scala.collection.immutable.Set[Int] = """ + $show(nums ));$skip(31); 
  var  morenums = Set(5,6,7,8);System.out.println("""morenums  : scala.collection.immutable.Set[Int] = """ + $show(morenums ));$skip(19); val res$0 = 
  nums.contains(5);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(10); val res$1 = 
  nums(3);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(48); 
  //union operator
  var mixed = fruits ++ nums;System.out.println("""mixed  : scala.collection.immutable.Set[Any] = """ + $show(mixed ));$skip(56); val res$2 = 
       //interfaction od two sets
      nums & morenums;System.out.println("""res2: scala.collection.immutable.Set[Int] = """ + $show(res$2));$skip(18); val res$3 = 
      fruits.head;System.out.println("""res3: String = """ + $show(res$3));$skip(18); val res$4 = 
      fruits.tail;System.out.println("""res4: scala.collection.immutable.Set[String] = """ + $show(res$4));$skip(21); val res$5 = 
      fruits.isEmpty;System.out.println("""res5: Boolean = """ + $show(res$5))}
  
}
