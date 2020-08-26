
object FunctionExample {

  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def abs(x: Int) = if (x < 0) -x else x          //> abs: (x: Int)Int
  abs(-5)                                         //> res0: Int = 5

  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n)
      r = r * i
    r
  }                                               //> fac: (n: Int)Int
  fac(5)                                          //> res1: Int = 120

  def inlinefactorial(n: Int) = if (n <= 0) 1 else n * fac(n - 1)
                                                  //> inlinefactorial: (n: Int)Int
  inlinefactorial(6)                              //> res2: Int = 720

  def printName(left: String = "[", firstname: String,
                lastname: String, right: String = "]") = println(left + firstname + " " + lastname + right)
                                                  //> printName: (left: String, firstname: String, lastname: String, right: String
                                                  //| )Unit
  printName("(", firstname = "sam", lastname = "naru")
                                                  //> (sam naru]
  // created an array of integer arguments for the method sum
  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }                                               //> sum: (args: Int*)Int
  sum(1, 2, 3, 4, 5)                              //> res3: Int = 15

  def printNames(args: String*) = {
    for (myString <- args) {
      println(myString);
    }

  }                                               //> printNames: (args: String*)Unit

  printNames("sam", "Ipsit", "Sneha")             //> sam
                                                  //| Ipsit
                                                  //| Sneha

}