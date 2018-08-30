package com.myscala.training.programs.abstraction

trait Printable5{  
	    def print()  
	}  
	  
	trait Showable{  
	   def show()  
	}  
	  
	class A6 extends Printable5 with Showable{  
	    def print(){  
	        println("This is printable")  
	    }  
	    def show(){  
	        println("This is showable")  
	    }  
	}  
	  
	object TraitExample{  
	    def main(args:Array[String]){  
	        var a = new A6()  
	        a.print()  
	        a.show()  
	    }  
}  
