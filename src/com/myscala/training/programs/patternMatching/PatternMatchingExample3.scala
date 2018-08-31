package com.myscala.training.programs.patternMatching

object PatternMatchingExample3 {
   def main(args: Array[String]) {
     var donutType = "Glazed Donut"
     val tasteLevel3 = donutType match {
        case "Glazed Donut" | "Strawberry Donut" => "Very tasty"
        case "Plain Donut" => "Tasty"
        case _ => "Tasty"
}
   println(s"Taste level of $donutType = $tasteLevel3")
   }
}