object decisions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  var today = "Monday"                            //> today  : String = Monday
  if (today == "Monday") println("its a rainy day")
  else println("its not a rainy day")             //> its a rainy day

  var b = 5                                       //> b  : Int = 5
  var a = if (b < 0) -1 else 1                    //> a  : Int = 1
  println(a)                                      //> 1
  println(if (b < 0) "-" else if (b == 0) "0" else "+")
                                                  //> +
  
  var rate = 10.50                                //> rate  : Double = 10.5
  def earning(s: String, h: Double): String = {
    if (s != "y") {
			   if(h <=40)
			   "Salary is $" + h *rate
				 else{"salary is: $"+ (40*rate + (h-40)*rate *1.5)}
		}
    else
    "This is salried employed not hourly payment"
    }                                             //> earning: (s: String, h: Double)String
   println(earning("n",30))                       //> Salary is $315.0
   println(earning("n",45))                       //> salary is: $498.75
   println(earning("y",40))                       //> This is salried employed not hourly payment
    
  
}