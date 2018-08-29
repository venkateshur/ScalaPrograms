package com.myscala.training.programs

object PartiallyAppliedFunc {
  def add(a:Int,b:Int) = {  
        a+b  
    }  
    def main(args: Array[String]) = {  
        var result = add(10,_:Int)  
//        var resul1 = add(10,5) 
        var result2 = result(3)  
        println("10 + 3 = "+result2)  
    }  
}
