object mapExamples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(64); 
  println("Welcome to the Scala worksheet");$skip(73); 
  var groceries = Map(1 -> "milk", 2-> "bread", 3 -> "juice", 4-> "egg");System.out.println("""groceries  : scala.collection.immutable.Map[Int,String] = """ + $show(groceries ));$skip(46); 
  groceries = groceries + (5 -> "hashbrowns");$skip(19); val res$0 = 
  groceries.get(5);System.out.println("""res0: Option[String] = """ + $show(res$0));$skip(15); val res$1 = 
  groceries(3);System.out.println("""res1: String = """ + $show(res$1));$skip(43); val res$2 = 
  groceries.getOrElse(7	, "nothing found");System.out.println("""res2: String = """ + $show(res$2));$skip(38); 
  for(v <-groceries.values)println(v);$skip(47); 
   var z  = for((k,v) <- groceries) yield(v,k);System.out.println("""z  : scala.collection.immutable.Map[String,Int] = """ + $show(z ))}
             
}
