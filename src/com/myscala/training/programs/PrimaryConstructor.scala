package com.myscala.training.programs

//Primary Constructor
class Student(id:Int, name:String){  
 	    def showDetails(){  
 	        println(id+" "+name);  
	    }  
	}  

	object PrimaryConstructor{  
	    def main(args:Array[String]){  
	        var s = new Student(101,"Rama");  
	        s.showDetails()  
	    }  
	}  

