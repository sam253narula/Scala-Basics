object setWorksheets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
   val fruits = Set("apple", "banana")            //> fruits  : scala.collection.immutable.Set[String] = Set(apple, banana)
  var  nums = Set(1,2,3,4,5)                      //> nums  : scala.collection.immutable.Set[Int] = Set(5, 1, 2, 3, 4)
  var  morenums = Set(5,6,7,8)                    //> morenums  : scala.collection.immutable.Set[Int] = Set(5, 6, 7, 8)
  nums.contains(5)                                //> res0: Boolean = true
  nums(3)                                         //> res1: Boolean = true
  //union operator
  var mixed = fruits ++ nums                      //> mixed  : scala.collection.immutable.Set[Any] = Set(5, banana, 1, 2, 3, apple
                                                  //| , 4)
       //interfaction od two sets
      nums & morenums                             //> res2: scala.collection.immutable.Set[Int] = Set(5)
      fruits.head                                 //> res3: String = apple
      fruits.tail                                 //> res4: scala.collection.immutable.Set[String] = Set(banana)
      fruits.isEmpty                              //> res5: Boolean = false
  
}