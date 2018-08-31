package com.myscala.training.programs.exceptionHandling

class ExceptionExample3{  
    def divide(a:Int, b:Int) = {  
        try{  
            a/b  
            var arr = Array(1,2)  
            arr(1) 
        }catch{  
            case e: ArithmeticException => println(e)  
            case ex: Exception =>println(ex)  
            case th: Throwable =>println("found a unknown exception"+th)  
        }  
        finally{  
            println("Finaly block always executes")  
        }  
         println("Rest of the code is executing...")  
    }  
}  

object ExceptionExample3 {
def main(args:Array[String]){  
        var e = new ExceptionExample3()  
            e.divide(100,10)  
   
    }  
}  