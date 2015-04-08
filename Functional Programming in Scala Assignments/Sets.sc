object Sets {
  println("Welcome to the Scala worksheet")
 
  type Set = Int => Boolean
  def singletonSet(elem : Int) : Set = {x => x == elem}
	
	def union(s : Set, t : Set) : Set = {x => s(x) || t(x)}
  def intersetction(s : Set, t : Set) : Set = {x => s(x) && t(x)}
  def diff(s : Set, t : Set) : Set = {x => s(x) && !t(x)}
 	val s1 = Set(2)
	s1(4)
 	val s2 = Set(3)
 	val s3 = union(s1, s2)
 
 
	 val s4 = Set(4)
	 val s5 = Set(3)
	 val s6 = Set(5)
 
	 val s7 = union(s4, union(s5, s6))

	 val s8 = diff(s7, s3)
	 
	 
	 
	 s8(7)
	 
	 def bound = 1000
	 
	 def forall(s : Set, p : Int => Boolean) : Boolean = {
	 
	 		def iter(a : Int) : Boolean = {
	 		    if(a > bound) true
	 		    else if (s(a) && !p(a)) false
	 		    else iter(a + 1)
	 		
	 		}
	 		
	 		iter(-bound)
	 
	 }
	 
	forall(s8, x => x > 0)
	
	def exists(s : Set, p : Int => Boolean) : Boolean = {
	
				def iter(a : Int) : Boolean = {
					if(a > bound) false
					else if(s(a) && p(a)) true
					else iter(a + 1)
				
				}
				
				iter(-bound)
	}
	
	exists(s8, x => x < 0)
	
	
	def map(s : Set, p : Int => Int) : Set = {
		
			
			
	
	}
	
	}
 