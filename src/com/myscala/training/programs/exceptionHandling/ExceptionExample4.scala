package com.myscala.training.programs.exceptionHandling

class ExceptionExample4{  
    def validate(age:Int)={  
        if(age<18)  
            throw new ArithmeticException("You are not eligible")  
        else println("You are eligible")  
    }  
}  
  
object ExceptionExample4{  
    def main(args:Array[String]){  
        var e = new ExceptionExample4()  
        e.validate(20)  
   
    }  
}  
