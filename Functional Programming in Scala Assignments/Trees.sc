object Trees {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  
  
 	abstract class Node{
 		
 			def incl(x : Int): Node
 			def contains(x : Int): Boolean
 	}
 	
 	class Empty extends Node{
 		def incl(x : Int) : Node = new NonEmpty(x, new Empty, new Empty)
 		
 		def contains(x: Int) : Boolean = false
 	
 	}
 	
 	class NonEmpty(elem: Int, left: Node, right: Node) extends Node{
 	
 		def contains(x : Int) : Boolean = {
 		
 			if(x < elem) left contains x
 			else if(x > elem) right contains x
 			else true
 		}
 		
 		def incl(x : Int) : Node = {
 	
 			if(x < elem) new NonEmpty(elem, left incl x, right)
 			else if(x > elem) new NonEmpty(elem, left, right incl x)
 			else new NonEmpty(elem, new Empty, new Empty)
 		
 		}
 		
  	
 	}
 	
   	val root = new NonEmpty(3, new Empty, new Empty)
                                                  //> root  : Trees.NonEmpty = Trees$$anonfun$main$1$NonEmpty$1@447a7f6b
    root contains 3                               //> res0: Boolean = true
 		val t1 = root incl 4              //> t1  : Trees.Node = Trees$$anonfun$main$1$NonEmpty$1@46436cec
		t1 contains 3                     //> res1: Boolean = true
		t1 contains 4                     //> res2: Boolean = true
		val t2 = t1 incl 78               //> t2  : Trees.Node = Trees$$anonfun$main$1$NonEmpty$1@74a41dfd
		val t3 = t2 incl 9                //> t3  : Trees.Node = Trees$$anonfun$main$1$NonEmpty$1@42ad08de
		t3 contains 3                     //> res3: Boolean = true
		t3 contains 4                     //> res4: Boolean = true
		t3 contains 78                    //> res5: Boolean = true
		t3 contains 5                     //> res6: Boolean = false
		t3 contains 9                     //> res7: Boolean = true
}