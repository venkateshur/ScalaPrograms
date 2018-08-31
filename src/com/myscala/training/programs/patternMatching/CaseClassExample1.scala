package com.myscala.training.programs.patternMatching


case class CaseClass(a:Int, b:Int)  
	  
object CaseClassExample1{  
	    def main(args:Array[String]){  
	        var c =  CaseClass(10,10)              // Creating object of case class  
	        println("a = "+c.a)                   // Accessing elements of case class  
	        println("b = "+c.b)  
	    }  
	
}  
