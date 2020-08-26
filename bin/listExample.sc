
object listExample {
  var l = List(2.0, 3, 5, 'a')                    //> l  : List[Double] = List(2.0, 3.0, 5.0, 97.0)
  //cons operator for creating list
  var l2 = 1 :: 2 :: 3 :: 4 :: Nil                //> l2  : List[Int] = List(1, 2, 3, 4)
  var l3 = List.range(10, 20)                     //> l3  : List[Int] = List(10, 11, 12, 13, 14, 15, 16, 17, 18, 19)
  var l4 = l ::: l2                               //> l4  : List[AnyVal{def getClass(): Class[_ >: Int with Double <: AnyVal]}] = 
                                                  //| List(2.0, 3.0, 5.0, 97.0, 1, 2, 3, 4)
  var sum = 0                                     //> sum  : Int = 0
  l3.foreach(sum += _)
  println(sum)                                    //> 145
  //list of tuples below:
  val listOfTuples = List((1, 2), (3, 4))         //> listOfTuples  : List[(Int, Int)] = List((1,2), (3,4))
  for ((a, b) <- listOfTuples) yield a + b        //> res0: List[Int] = List(3, 7)

  //Home work on list, create a alist find al aggregate function results
  var nums = List(1, 2, 3, 4, 5)                  //> nums  : List[Int] = List(1, 2, 3, 4, 5)

  def avg(a: Array[Int]): Double = {
    var sum = 0
    for (v <- a) yield sum += v
    sum / a.length
  }                                               //> avg: (a: Array[Int])Double
  var min = (a: Array[Int]) => {
    var m = a(0)
    for (v <- a) if (v < m) m = v
    m
  }                                               //> min  : Array[Int] => Int = listExample$$$Lambda$17/1121454968@3bfdc050
  var max = (a: Array[Int]) => {
    var m = a(0)
    for (v <- a) if (v > m) m = v
    m
  }                                               //> max  : Array[Int] => Int = listExample$$$Lambda$18/466505482@5e3a8624

  var numArray = Array(10, 20, 35, 4, 34, 45, 100)//> numArray  : Array[Int] = Array(10, 20, 35, 4, 34, 45, 100)
  println("Average is: " + avg(numArray))         //> Average is: 35.0
  println("Min value is: " + min(numArray))       //> Min value is: 4
  println("Max value is: " + max(numArray))       //> Max value is: 100

}