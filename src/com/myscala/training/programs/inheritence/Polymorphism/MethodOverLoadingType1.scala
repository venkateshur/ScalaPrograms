package com.myscala.training.programs.inheritence.Polymorphism

//Scala Method Overloading Example by using Different Parameters(Compile Time Polymorphism)
class Arithmetic{  
	    def add(a:Int, b:Int){  
	        var sum = a+b  
	        println(sum)  
	    }  
	    def add(a:Int, b:Int, c:Int){  
	        var sum = a+b+c  
	        println(sum)  	    
   }  
}  
	  
	object MethodOverLoadingType1{  
	    def main(args:Array[String]){  
	        var a  = new Arithmetic();  
	        a.add(10,10);  
	        a.add(10,10,10);  
	  }  
}  

