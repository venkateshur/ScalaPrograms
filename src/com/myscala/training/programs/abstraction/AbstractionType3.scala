package com.myscala.training.programs.abstraction

abstract class Bike2{  
 //	    def run()  
 //	    def walk()   // Abstract method  
	}  
	  
class Hero2 extends Bike2{        // Not implemented in this class  
//      def run() {
//        println("run")
//      }
//       def walk() {
//        println("walk")
//      }
	    def runHero(){  
	        println("Running fine...")  
	    }  
	}  

object AbstractionType3 {
  def main(args: Array[String]){  
    var h = new Hero2()  
        h.runHero()  
	    }  
	}  

  