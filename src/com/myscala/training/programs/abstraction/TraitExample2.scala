package com.myscala.training.programs.abstraction

trait Printable1{  
     def print()  
	}  

abstract class A5 extends Printable1{            // Must declared as abstract class  
	   def printA5(){  
	       println("Hello, this is A4 Sheet")  
	   }  
	}  


object TraitExample2 {
   def main(args:Array[String]){  
//	        var a = new A4()  
//	        a.print()  
     println("trait with abstract class")
	    }  
  
}