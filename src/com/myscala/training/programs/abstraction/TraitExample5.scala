package com.myscala.training.programs.abstraction

 trait  Print8{  
   def print()  
	}  
	  
	abstract class Print9{  
	  
//	  trait Print9{ 
	    def printA4()  
	}  
	  
//class A10 extends Print8 with Print9{               // First one is trait second one is abstract class
class A10 extends Print9 with Print8{                 // First one is abstract class second one is trait  
    def print(){                // Trait print  
        println("print sheet")  
	    }  
    def printA4(){              // Abstract class printA9 
        println("Print A9 Sheet")  
    }  
}  
	  
object TraitExample5{  
	    def main(args:Array[String]){  
        var a = new A10()  
        a.print()  
	    }  
}  
