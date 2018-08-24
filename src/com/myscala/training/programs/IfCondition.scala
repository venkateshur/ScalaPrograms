package com.myscala.training.programs

object IfCondition {
  def main (args: Array[String]) {
  val number:Int = 50 
  val number2 = 50
  
  //if and else-if
     if(number>=0 && number<50){  
       println ("fail")  
       }  
     else if(number>=50 && number<60){  
             println("D Grade")  
      }  
  else if(number>=60 && number<70){  
      println("C Grade")  
  }  
  else if(number>=70 && number<80){  
          println("B Grade")  
  }  
  else if(number>=80 && number<90){  
          println("A Grade")  
  }  
else if(number>=90 && number<=100){  
        println("A+ Grade")  
}  
  else println ("Invalid") 
 //just if test   
  if(number2 == 50) {
    println("number:" + number2)
   }
  //if and else 
  if(number2 < 50) {
    println("number:" + number2)
   } else {
      println("number is not less than 50: " + number2)
   }
  }
}