package com.myscala.training.programs.inheritence

class Employee{  
    var salary:Float = 10000  
}  
	  
class Programmer extends Employee{  
	    var bonus:Int = 5000  
	    println("Salary = "+salary)  
	    println("Bonus = "+bonus)  
}  

object InheritenceSingle1 {
  def main(args:Array[String]){  
        new Programmer()  
    }  
  }  
