package com.myscala.training.programs.collections

object ArrayExamples extends App {

  val array = Array(1,2,3,4)
  println("index : " + array(0))
  val arrayToList = array.toList
  println("take2: " + arrayToList.take(2))
  println("take2fromright: " + arrayToList.takeRight(2))
  println("tail: " + arrayToList.tail)

  // (0,1,2,3) -> 1,2,3,4
}
