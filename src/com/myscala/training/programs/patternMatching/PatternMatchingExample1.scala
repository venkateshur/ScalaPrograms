package com.myscala.training.programs.patternMatching

object PatternMatchingExample1 {

def main(args: Array[String]) {

println(matchValue(6))

}

def matchValue(i: Int): String = i match {
case 1 => "one"
case 2 => "two"
case 3=> "three"
case _=> "unknown"
  }
}