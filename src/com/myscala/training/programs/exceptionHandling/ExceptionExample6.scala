package com.myscala.training.programs.exceptionHandling

class InvalidAgeException(s:String) extends Exception(s){}  

class ExceptionExample6{  
    @throws(classOf[InvalidAgeException])  
    def validate(age:Int){  
        if(age<18){  
            throw new InvalidAgeException("Not eligible")  
        }else{  
            println("You are eligible")  
        }  
    }  
}  
object ExceptionExample6{  
    def main(args:Array[String]){  
        var e = new ExceptionExample6()  
        try{  
            e.validate(5)  
        }catch{  
            case e : Exception => println("Exception Occured : "+e)  
        }  
    }  
}  
