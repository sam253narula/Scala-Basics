object mapExamples {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var groceries = Map(1 -> "milk", 2-> "bread", 3 -> "juice", 4-> "egg")
                                                  //> groceries  : scala.collection.immutable.Map[Int,String] = Map(1 -> milk, 2 -
                                                  //| > bread, 3 -> juice, 4 -> egg)
  groceries = groceries + (5 -> "hashbrowns")
  groceries.get(5)                                //> res0: Option[String] = Some(hashbrowns)
  groceries(3)                                    //> res1: String = juice
  groceries.getOrElse(7	, "nothing found")        //> res2: String = nothing found
  for(v <-groceries.values)println(v)             //> hashbrowns
                                                  //| milk
                                                  //| bread
                                                  //| juice
                                                  //| egg
   var z  = for((k,v) <- groceries) yield(v,k)    //> z  : scala.collection.immutable.Map[String,Int] = Map(milk -> 1, hashbrowns 
                                                  //| -> 5, juice -> 3, egg -> 4, bread -> 2)
             
}