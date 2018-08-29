package com.myscala.training.programs

object NestedFuntions {
  
def add(a:Int, b:Int, c:Int) = {  
        def add2(x:Int,y:Int) = {  
            x+y  
        }  
        add2(a,add2(b,c)) // ===> add2(b,c) = 20, add2(a,20) ==> add2(10,20) = 30 
    }  
    def main(args: Array[String]) = {  
        var result = add(10,10,10)  
        println(result)  
    }  
}  