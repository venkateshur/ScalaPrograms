package com.myscala.training.programs.abstraction

trait Printable7{  
	    def print()         // Abstract method  
	    def show(){         // Non-abstract method  
	        println("This is show method")  
	    }  
}  
	  
class A7 extends Printable7{  
	    def print(){  
        println("This is print method")  
	    }  
}  
	  
object TraitExample4{  
    def main(args:Array[String]){  
        var a = new A7()  
        a.print()  
        a.show()  
	    }  
	}  

