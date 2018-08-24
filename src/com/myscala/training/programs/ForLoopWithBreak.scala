package com.myscala.training.programs
import scala.util.control.Breaks._                  // Importing  package  

object ForLoopWithBreak { 
   def main(args: Array[String]) {  
        breakable {                                 // Breakable method to avoid exception  
            for(i<-1 to 50 by 1){  
                if(i==48)   
                    break                           // Break used here  
                else  
                    println(i)  
            }  
        }  
    }  
}  
