
object LoopsWoeksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var x = 10                                      //> x  : Int = 10
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
    println(y)                                    //> 10
                                                  //| 9
                                                  //| 8
                                                  //| 7
                                                  //| 6
                                                  //| 5
                                                  //| 4
                                                  //| 3
                                                  //| 2
                                                  //| 1
                                                  //| 0
  }
  var y = for (num <- 1 to 10) yield num + 1      //> y  : scala.collection.immutable.IndexedSeq[Int] = Vector(2, 3, 4, 5, 6, 7, 8
                                                  //| , 9, 10, 11)
  var word = "monday"                             //> word  : String = monday
  for (x <- 0 until word.length) {
    println(word(x))                              //> m
                                                  //| o
                                                  //| n
                                                  //| d
                                                  //| a
                                                  //| y
  }

}