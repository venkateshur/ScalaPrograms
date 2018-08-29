package com.myscala.training.programs

object Opt {
  def main(args:Array[String]) {
    val list1: List[Option[Int]] = List(Some(5),Some(6),Some(7))
    if(list1.isDefinedAt(4)){
      println(list1(4))
    } else {println(null)}
     
//     println(list1(4))
       println(list1(3).getOrElse(0).toString())
  }
}