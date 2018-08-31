package com.myscala.training.programs.exceptionHandling

class ExceptionExample{  
    def divide(a:Int, b:Int) = {  
            a/b                  // Exception occurred here  
        println("Rest of the code is executing...")  
    }  
}  
object ExceptionExample1{  
    def main(args:Array[String]){  
        var e = new ExceptionExample()  
        e.divide(100,0)  
   
    }  
}
