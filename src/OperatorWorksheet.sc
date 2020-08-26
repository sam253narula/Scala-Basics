object OperatorWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var x  = 3                                      //> x  : Int = 3
  var y =9                                        //> y  : Int = 9
  var sum =  x+y                                  //> sum  : Int = 12
  var  andOp = x&y                                //> andOp  : Int = 1
  var orOp = x|y                                  //> orOp  : Int = 11
  var exOrOp = x^y                                //> exOrOp  : Int = 10
  
  var b4 = x<<2                                   //> b4  : Int = 12
  val nums = 1::2::3::4::Nil                      //> nums  : List[Int] = List(1, 2, 3, 4)
  
  if(x > 0 || y > 0) "BOTH VALUES ARE POSITIVE"   //> res0: Any = BOTH VALUES ARE POSITIVE
  
}