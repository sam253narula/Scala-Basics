package com.learn.concepts.worksheets



object LoopsWoeksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 
  println("Welcome to the Scala worksheet");$skip(13); 
  var x = 10;System.out.println("""x  : Int = """ + $show(x ));$skip(139); 
  /* while(x >=0){
  print(x)
  x-=1
  } */

  /* do {
 println(x)
 x-=1
 }
 while(x >= 0)
 */
  for (y <- 10 to 0 by -1) {
    println(y)
  };$skip(49); 
  var y = for (num <- 1 to 10) yield num + 1;System.out.println("""y  : scala.collection.immutable.IndexedSeq[Int] = """ + $show(y ));$skip(22); 
  var word = "monday";System.out.println("""word  : String = """ + $show(word ));$skip(56); 
  for (x <- 0 until word.length) {
    println(word(x))}
  }

}
