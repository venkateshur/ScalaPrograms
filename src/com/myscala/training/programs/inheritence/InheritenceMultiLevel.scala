package com.myscala.training.programs.inheritence

//Multi Level Inheritence - A->B->C
	class A{  
    var salary1 = 10000  
	}  
	  
	class B extends A {  
	    var salary2 = 20000  
	}  
	
	class D extends A{  
	    var salary3 = 30000  
	} 
	  
	class C extends B{  
	    def show(){  
	        println("salary1 = "+salary1)  
          println("salary2 = "+salary2)  
    }  
	}  
	  
	object InheritenceMultiLevel{  
	    def main(args:Array[String]){    
	        var c = new C()  
	        c.show()  
	      
	    }  
	} 
