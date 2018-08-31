package com.myscala.training.programs

//Scala Singleton Object

object SigletonObject{  
      def main(args:Array[String]){  
	      val c = Object.hello()             // No need to create object. 
	      val d = Object.hello()
	      println(Object.a)
	      
	    }  
	}  	  
	  
object Object{  
  var a = 5
  def hello(){  
	    println("Hello, This is Singleton Object")  
	 }  
}  

