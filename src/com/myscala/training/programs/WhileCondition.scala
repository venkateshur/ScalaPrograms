package com.myscala.training.programs

object WhileCondition {
    def main(args: Array[String]) {  
      println("while:  ")
      var a = 10;                    // Initialization  
      while( a == 20 ){                // Condition  
         println(a);  
          a = a+2                     // Incrementation  
      }  
      
      println("do while:  ")
       var b = 10;  
        do {  
            println( b );  
            b = b + 2;      // Increment  
        }  
        while( b == 20 )     // Condition    
  }  
}  
