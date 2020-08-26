package com.learn.concepts.worksheets

object FunctionExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(108); 

  println("Welcome to the Scala worksheet");$skip(41); 
  def abs(x: Int) = if (x < 0) -x else x;System.out.println("""abs: (x: Int)Int""");$skip(10); val res$0 = 
  abs(-5);System.out.println("""res0: Int = """ + $show(res$0));$skip(85); 

  def fac(n: Int) = {
    var r = 1
    for (i <- 1 to n)
      r = r * i
    r
  };System.out.println("""fac: (n: Int)Int""");$skip(9); val res$1 = 
  fac(5);System.out.println("""res1: Int = """ + $show(res$1));$skip(67); 

  def inlinefactorial(n: Int) = if (n <= 0) 1 else n * fac(n - 1);System.out.println("""inlinefactorial: (n: Int)Int""");$skip(21); val res$2 = 
  inlinefactorial(6);System.out.println("""res2: Int = """ + $show(res$2));$skip(164); 

  def printName(left: String = "[", firstname: String,
                lastname: String, right: String = "]") = println(left + firstname + " " + lastname + right);System.out.println("""printName: (left: String, firstname: String, lastname: String, right: String)Unit""");$skip(55); 
  printName("(", firstname = "sam", lastname = "naru");$skip(159); 
  // created an array of interger arguments for the method sum
  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  };System.out.println("""sum: (args: Int*)Int""");$skip(21); val res$3 = 
  sum(1, 2, 3, 4, 5);System.out.println("""res3: Int = """ + $show(res$3));$skip(102); 

  def printNames(args: String*) = {
    for (myString <- args) {
      println(myString);
    }

  };System.out.println("""printNames: (args: String*)Unit""");$skip(39); 

  printNames("sam", "Ipsit", "Sneha")}

}
