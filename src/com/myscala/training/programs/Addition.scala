package com.myscala.training.programs

object Addition {
  
  def main(args:Array[String]) {
   val x = 10
   val y = 20
  def z = 5
//  val c = x + y
 
  addition(x) //call by value
  addition(x,y)
  addition()
 // val d  = y - x
  //val e  = x*y
 //   println(x)
 //   println(z)
      additionVar(5,19)
      additionVar(2,3,x,y,z)
      additionVar(x,y)
      additionVar(1)
  }
  def addition(a:Int=0,b:Int=1)  {
     val add = (a + b)
     val mult = a * b
     println(add)
  }
 def additionVar(v:Int*)  {
     var i = 0
     for(arg <- v) {
      println("Arg value[" + i + "] = " + arg ); 
        i = i + 1;
     }
    }
}