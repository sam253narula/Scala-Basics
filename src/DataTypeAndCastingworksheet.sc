

object DataTypeAndCastingworksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //dynamically typed language auto infers data type
  var x =5                                        //> x  : Int = 5
  var str  = "scala is cool"                      //> str  : String = scala is cool
  //To create mutable list use below syntax
  var odds  = List(1,2,3,4,5)                     //> odds  : List[Int] = List(1, 2, 3, 4, 5)
  //To create immuable list use below syntax
  2 to 10                                         //> res0: scala.collection.immutable.Range.Inclusive = Range 2 to 10
 // mutable varaiable declaration
  var y = true                                    //> y  : Boolean = true
  //Immutable variable declaration
  val pi = 3.14159                                //> pi  : Double = 3.14159
  //Inline function definition
  def add(a:Int,b:Int): Int = a+b                 //> add: (a: Int, b: Int)Int
  add(4,9)                                        //> res1: Int = 13
/*automatic type inferance based on data type hirarchy, Any is the parent of all type in scala,
  like we have object as aprent of all classes in java,
  there are no primitive data types in scala, all datatypes are classes */
  var list1  = List(1,true,"sam")                 //> list1  : List[Any] = List(1, true, sam)
  var list2 = List(1,true)                        //> list2  : List[AnyVal] = List(1, true)
  var c  = 10.toString()                          //> c  : String = 10
  var b= 10.to(20)                                //> b  : scala.collection.immutable.Range.Inclusive = Range 10 to 20
  var e = 10. +(11)                               //> e  : Int = 21
  var f = 97.toChar                               //> f  : Char = a
  
}