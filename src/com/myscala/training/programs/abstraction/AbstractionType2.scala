package com.myscala.training.programs.abstraction

abstract class Bike1(a:Int){               // Creating constructor  
	    var b:Int = 20                       // Creating variables  
	    var c:Int = 25  
	    def run()                           // Abstract method  
	    def performance(){                  // Non-abstract method  
	        println("Performance awesome")  
	    }  
	}  
	  
class Hero1(a:Int) extends Bike1(a){  
	    c = 30  
    def run(){  
	        println("Running fine...")  
          println("a = "+a)  
	        println("b = "+b)  
	        println("c = "+c)  
	    }  
	}  
	  
object AbstractionType2{  
    def main(args: Array[String]){  
	        var h = new Hero1(10)  
	        h.run()  
          h.performance()  
	    }  
}  
