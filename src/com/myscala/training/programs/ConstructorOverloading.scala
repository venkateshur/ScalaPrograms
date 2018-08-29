package com.myscala.training.programs

//Constructor overloading
class Student4(id:Int){  
	    def this(id:Int, name:String)={  
	        this(id)  
	        println(id+" "+name)  
	        }  
	        println(id)  
	}  	  
	object ConstructorOverloading{  
	    def main(args:Array[String]){  
	        new Student4(101)  
	        new Student4(100,"India")  //Constructor overloading
	    }  
	}  
