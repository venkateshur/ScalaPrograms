package com.myscala.training.programs.patternMatching

object PatternMatchingExample5 {
  def main(args:Array[String]){
     var donutType = "Glazed Donut"
     val tasteLevel4 = donutType match {
     case donut if (donut.contains("Glazed") || donut.contains("Strawberry")) => "Very tasty"
     case "Plain Donut"  => "Tasty"
     case _  => "Tasty"
   }
   println(s"Taste level of $donutType = $tasteLevel4")
  }
}