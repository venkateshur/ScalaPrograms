package com.myscala.training.programs

class NoAccessModifier {
     var a:Int = 10  
     def show(){  
         println(" a = "+a)  
     }  
     show()
     
     def show1(){
       println("outside")
     }
     show1()
}   
object NoAccessObject{  
    def main(args:Array[String]){  
        var a = new NoAccessModifier()  
        a.show()  
    }  
}