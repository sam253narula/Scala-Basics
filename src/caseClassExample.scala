

object caseClassExample extends App{
  val samarth = Student("Samarth", 25)
  val saif = Student("Saif", 28)
  
  for(student <- List(samarth, saif)){
    student match {
      case Student("Samarth", 25) => println("Hi sam")
      case _ => println("Hi saif")   }
    
  }
}
case class Student(fName:String, age:Int)