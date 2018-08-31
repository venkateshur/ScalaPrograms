package com.myscala.training.programs.patternMatching

case class employee(id: Int, employee_name: String) // case class

object patternMatchingExample2 {
      def main(args: Array[String]) {
          val a =  new employee(1, "Ram") //a =>(1,Ram)
          val b  = employee(2, "Anil")
          val c  = new employee(3, "Sunil")
          
      for (employee1 <- List(a, b, c)) {
           employee1 match {
            case employee(1, "Ram") => println("Hello Ram")
            case employee(2, "Anil") => println("Hello Anil")
            case employee(id, employee_name) => println("ID: " +id + ", Employee:" + employee_name)
        }

      }

    }
}
  