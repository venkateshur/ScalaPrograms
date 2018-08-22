package com.myscala.training.programs

import com.myscala.training.programs.calls.Print1

object Sample2 {
  
  def main(args:Array[String]) {
    val name = "scala package test"
    val name2 = "scala package test2"
    val name3 = 9
    var a = true
    var b = false
    println("a && b = " + (a&&b) ); 
    println("a || b = " + (a||b) ); 
    println("!(a && b) = " + !(a && b) );
    
    val  all = new Print1()
         all.printString(name)
        var myVar :Int = 9;
 //   println(name)
  }
}