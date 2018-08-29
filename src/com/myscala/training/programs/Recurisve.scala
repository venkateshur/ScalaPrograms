package com.myscala.training.programs

object Recurisve {
  def main(args: Array[String]) {
    val d = factorial(5) //5*4*3*2*1
    println(d)
//   for (i <- 1 to 10) 
//    println( "Factorial of " + i + ": = " + factorial(i) ) } 
  }
  def factorial(n: BigInt): BigInt = { 
    if (n <= 1) 1 else 
      n * factorial(n - 1) } //==>5*(5-1)*(4-1)*(3-1)*(2-1) 
 
}