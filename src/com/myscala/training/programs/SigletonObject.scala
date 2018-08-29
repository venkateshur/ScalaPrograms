package com.myscala.training.programs

//Scala Singleton Object

object SigletonObject{  
      def main(args:Array[String]){  
	        Object.hello()             // No need to create object.  
	    }  
	}  	  
	  
object Object{  
  def hello(){  
	    println("Hello, This is Singleton Object")  
	 }  
}  

