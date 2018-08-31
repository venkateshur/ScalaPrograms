package com.myscala.training.programs.patternMatching

object PatternMatchingExample4 {
    def main(args:Array[String]) {
      val priceOfDonut: Any = "String"
      val priceType = priceOfDonut match {
        case price: Int => "Int"
        case price: Double => "Double"
        case price: Float => "Float"
        case price: String => "String"
        case price: Boolean => "Boolean"
        case price: Char => "Char"
        case price: Long => "Long"
}
println(s"Donut price type = $priceType")
    }
  
}