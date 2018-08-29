package com.myscala.training.programs.inheritence.Polymorphism

//Scala Method Overloading Example by using Different Data Type(Compile Time Polymorphism)
class ArithmeticType2{  
	  def add1(a:Int, b:Int){  
	       var sum = a+b  
	        println(sum)  
	    }
	    def add1(a:Double, b:Double){  
	        var sum = a+b  
	        println(sum)  
	    }  
	}  
object MethodOverLoadingType2{  
	    def main(args:Array[String]){  
	        var b = new ArithmeticType2()  
	        b.add1(10,10)  
	        b.add1(10.0,20.0)  
	  
	    }  
	}  
