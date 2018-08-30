package com.myscala.training.programs.abstraction


abstract class Bike{  
   def run()     //abstract method
}  
  
class Hero extends Bike{  
    def run(){  
      println("running fine...")  
    }
  }  
  
object AbstractionType1{  
    def main(args: Array[String]){  
        var h = new Hero()  
        h.run()  
    }  
}  

