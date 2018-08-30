package com.myscala.training.programs.abstraction

trait Printable{  
	    def print()  //abstract method
	}  
	  
	class A4 extends Printable{  
	    def print(){  
        println("Hello")  
	    }  
	}  
  
	object TraitExample1{  
    def main(args:Array[String]){  
	        var a = new A4()  
	        a.print()  
	    }  
	}  

