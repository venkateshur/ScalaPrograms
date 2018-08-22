package com.myscala.training.programs

object ForLoop {
  def main(args: Array[String]) { 
        println("for loop with to")
        for( a <- 1 to 10 ){  
         println(a) 
      }  
        println("for loop with until")
        for( a <- 1 until 10 ){ //10==> 10-1 = 9 , last n ==> n-1 
         println(a) 
      }  
        println("for loop with if")
        for( a <- 1 to 10 if a%2==0 ){  
         println(a);  
      }  
        println("for loop with yield")
        val result = for( a <- 1 to 10) yield a  //for comprehension
         println("result:" + result)
         for(i<-result){  
            println(i)  
          }
        println("for loop with iterator")
        var list = List('A','B','C','D','E','F','G','H','I')          // Creating a list  
        for( i <- list){                         // Iterating the list  
            println(i)  
        }
        println("for loop with by")
        for(i<-1 to 10 by 5){  
            println(i)  
        }  
      }  
   }  
 
