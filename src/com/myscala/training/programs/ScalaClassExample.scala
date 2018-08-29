package com.myscala.training.programs

class Student0{  
	    var id:Int = 0;    //instance variable                       // All fields must be initialized  
	    var name:String = null;  
	    
	}  
object ScalaClassExample{  
	    def main(args:Array[String]){  
	        var s = new Student0()               // Creating an object  
	        s.id = 5
	        println(s.id);  
	        var s1 = new Student0()
	        println(s1.id+" "+s1.name); 
	    }  
	}
