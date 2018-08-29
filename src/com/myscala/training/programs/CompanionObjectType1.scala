package com.myscala.training.programs

class Comapanion{  
   def hello(){  
        println("Hello, this is Companion Class.")  
	    }  
	}  
	object Companoin{  
	    def main(args:Array[String]){  
	        new Comapanion().hello()  
	        println("And this is Companion Object.")  
	   }  
}  
