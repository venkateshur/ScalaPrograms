package com.myscala.training.programs.exceptionHandling

class ExceptionExample5{  
    @throws(classOf[NumberFormatException])  
    def validate()={  
        "abc".toInt  
    }  
}  
  
object ExceptionExample5{  
    def main(args:Array[String]){  
        var e = new ExceptionExample5()  
        try{  
            e.validate()  
        }catch{  
            case ex : NumberFormatException => println("Exception handeled here")  
        }  
        println("Rest of the code executing...")  
    }  
}  
