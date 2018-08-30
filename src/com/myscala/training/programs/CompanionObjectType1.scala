package com.myscala.training.programs

class Comapanion{  
    def hello(){  
        println("Hello, this is Companion Class.")  
	    }  
	}  

object Comapanion{ 
	        def apply(): Comapanion = new Comapanion()
//	      new Comapanion().hello()  
//	        println("And this is Companion Object.")  
}  

	object CompanionObjectType1{  
	    def main(args:Array[String]){  
	        val c = Comapanion.apply()
	        c.hello()
	        println("And this is Companion Object.")  
	   }  
}  
