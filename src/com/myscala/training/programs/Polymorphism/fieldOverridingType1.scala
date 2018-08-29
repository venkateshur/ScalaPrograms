package com.myscala.training.programs.inheritence.Polymorphism


//Scala Field Overriding(Run Time Polymorphism)
class Vehicle1{  
	//    var speed:Int = 60  
	    val speed:Int = 60
	  
	}  
	class Bike1 extends Vehicle1{  
	//    var speed:Int = 100  
    	  override val speed:Int = 100 
	    def show(){  
	        println(speed)  
	    }  
	}  
	object fieldOverridingType1{  
	    def main(args:Array[String]){  
	        var b = new Bike1()  
	        b.show()  
	    }  
	}  

