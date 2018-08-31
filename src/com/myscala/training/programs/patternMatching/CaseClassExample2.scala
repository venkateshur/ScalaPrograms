package com.myscala.training.programs.patternMatching

trait SuperTrait  
case class CaseClass0(a:String) extends SuperTrait
case class CaseClass1(a:Int,b:Int) extends SuperTrait  
case class CaseClass2(a:Int) extends SuperTrait           // Case class  
case object CaseObject extends SuperTrait                // Case object  
object CaseClassExample2{  
	    def main(args:Array[String]){  
//	        callCase(CaseClass1(10,10))  
//	          callCase(CaseClass2(10))  
//  	          callCase(CaseObject)  
  	          callCase(CaseClass0("Ram"))
    }  
	    def callCase(f:SuperTrait) = f match{  
	        case CaseClass1(f,g)=>println("a = "+f+" b ="+g)  
          case CaseClass2(f)=>println("a = "+f)  
	        case CaseObject=>println("No Argument")
	        case _ => println("not matched")
	    }  
	}  
