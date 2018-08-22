package com.myscala.training.programs

class PrivateAccessModifier {
      var a:Int = 10  
     def show(){  
         println(a)  
     }  
}
object PrivateObject{  
    def main(args:Array[String]){ 
        var p = new PrivateAccessModifier()  
        p.a = 12  
        p.show()  
  }  
}