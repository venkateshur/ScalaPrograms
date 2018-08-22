package com.myscala.training.programs

class AccessModifierProtected{  
      protected var a:Int = 10  
}  
class SubClass extends AccessModifierProtected{  
    def display(){  
        println("a = "+a)  
    }  
}  
object ProtectedObject{  
    def main(args:Array[String]){  
        var s = new SubClass()  
        s.display()  
    }  
}  
