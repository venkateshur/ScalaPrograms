package com.myscala.training.programs

object OptionExample {
  def main(args: Array[String]) {
    val a = 5
    val b = "name"
    println(convert("5str","0"))
    println(convert("10str","3"))
    def convert(a:String,b:String):Option[Any] = {
         val c = Some(a.toString())
         if (c.isDefined) {
             Some(c)
         } else {
           None
         }
      
    }
  }
}

