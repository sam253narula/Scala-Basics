object higerOrderFns {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val double = (i: Int) => i * 2                  //> double  : Int => Int = higerOrderFns$$$Lambda$8/288665596@7c75222b
  //: Int => Int) in below line simple means any function that takes in a Int and returns a Int
  //one function take another function as input below:
  def higherorder(x: Int, y: Int => Int) = y(x)   //> higherorder: (x: Int, y: Int => Int)Int
  higherorder(6, double)                          //> res0: Int = 12
  
  val triple = (x: Int) => x * 3                  //> triple  : Int => Int = higerOrderFns$$$Lambda$9/1277181601@27f674d
  def higerOrderFunTriple(a: Int, b: Int => Int) = b(a)
                                                  //> higerOrderFunTriple: (a: Int, b: Int => Int)Int
  higerOrderFunTriple(3, triple)                  //> res1: Int = 9

  def sayHello = (name: String) => {
    "Hello" + " " + name
  }                                               //> sayHello: => String => String
  var message = sayHello("sam")                   //> message  : String = Hello sam
  
  var y = 5                                       //> y  : Int = 5
  val multiplier = (x:Int) => x*y                 //> multiplier  : Int => Int = higerOrderFns$$$Lambda$11/509886383@6e8dacdf
  multiplier(10)                                  //> res2: Int = 50
  
}