object decisions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(23); 
  var today = "Monday";System.out.println("""today  : String = """ + $show(today ));$skip(90); 
  if (today == "Monday") println("its a rainy day")
  else println("its not a rainy day");$skip(13); 

  var b = 5;System.out.println("""b  : Int = """ + $show(b ));$skip(31); 
  var a = if (b < 0) -1 else 1;System.out.println("""a  : Int = """ + $show(a ));$skip(13); 
  println(a);$skip(56); 
  println(if (b < 0) "-" else if (b == 0) "0" else "+");$skip(22); 
  
  var rate = 10.50;System.out.println("""rate  : Double = """ + $show(rate ));$skip(240); 
  def earning(s: String, h: Double): String = {
    if (s != "y") {
			   if(h <=40)
			   "Salary is $" + h *rate
				 else{"salary is: $"+ (40*rate + (h-40)*rate *1.5)}
		}
    else
    "This is salried employed not hourly payment"
    };System.out.println("""earning: (s: String, h: Double)String""");$skip(28); 
   println(earning("n",30));$skip(28); 
   println(earning("n",45));$skip(28); 
   println(earning("y",40))}
    
  
}
