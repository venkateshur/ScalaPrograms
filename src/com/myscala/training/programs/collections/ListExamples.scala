package com.myscala.training.programs.collections

object ListExamples {

  def main(args: Array[String]) {

    val list = List(1,2,3,4,55,66,109,45,67)
    println("maximum number:" + list.max)
    println("minmum number:" + list.min)
      println("sort in ascending:" + list.sorted)
    println("sort in ascending:" + list.sortWith(_>_))
    println("size of the list:" + list.size)
    println("even number:" + list.filter(_%2 ==0))
    println("even number:" + list.filter(x => x%2 == 0))

    val newListprepend = 999 +: list
    val newListappend = list :+ 888
    println("newlist: " + newListprepend)
    println("newlist: " + newListappend)

    val addingtwolists = newListprepend ++ newListappend
    println("listAddition: " + addingtwolists)
    println("removeDuplicates: " + addingtwolists.distinct)
    println("index: " + list(0))

    //1->2->3-4->55

    }

}
