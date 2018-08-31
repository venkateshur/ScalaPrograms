package com.myscala.training.programs.exceptionHandling

class ExceptionExample2{  
    def divide(a:Int, b:Int) = {  
        try{  
            a/b  
        }catch{  
            case e: ArithmeticException => println(e) 
            case s: Exception =>println(s)
        }  
        println("Rest of the code is executing...")  
    }  
}  
object ExceptionExample2{  
    def main(args:Array[String]){  
        var e = new ExceptionExample2()  
        e.divide(100,0)  
   
    }  
}  
