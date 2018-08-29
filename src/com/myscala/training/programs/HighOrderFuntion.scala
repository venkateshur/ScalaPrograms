package com.myscala.training.programs

object HighOrderFuntion {
   def main(args: Array[String]) = {  
     functionExample(multiplyBy2)                   // Passing a function as parameter  
     functionExample(addBy2)
    }  
    def functionExample(f:Int=>AnyVal,a:Int=5):Unit = {  
        println(f(a))                                   // Calling that function   
    }  
    def multiplyBy2(a:Int):Int = {  
        a*2  
    }  
     def addBy2(a:Int):Int = {  
        a + 2  
    }  
 }  
