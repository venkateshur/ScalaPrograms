package com.myscala.training.programs.Polymorphism
//Scala Method Overriding(Run Time Polymorphism)

class Vehicle{  
	   def run(){  
	        println("vehicle is running")  
	    }  
	}  
	  
	class Bike extends Vehicle{  
	     override def run(){  
	        println("Bike is running")  
	    }  
	}  
	  
	object MethodOverridingType1{  
	    def main(args:Array[String]){  
	        var b = new Bike()  
	        var c = new Vehicle()
	        b.run() 
	        c.run()
	    }  
	}  

