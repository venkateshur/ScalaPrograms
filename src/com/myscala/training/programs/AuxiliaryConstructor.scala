package com.myscala.training.programs

class Student2(id:Int,name:String){  
	    var age1:Int = 0  
	    
	    def showDetails(){  
	        println(id+" "+name)  
	    }
	    def showDetails1(){  
	        println(id+" "+name+" " +age1)  
	    }
	    def this(id:Int, name:String,age:Int){  //Secondary(Auxiliary) Constructor
	        this(id,name)                       // Calling primary constructor, and it is first line  
	        this.age1 = age 
	        
	    }  
	}  
  
	object AuxiliaryConstructor{  
	    def main(args:Array[String]){ 
	        val so = new Student2(103,"Rama")
 	        so.showDetails() 
	        var s =  new Student2(101,"Rama",20)  
  	        s.showDetails1()        
	    }  
	}  
