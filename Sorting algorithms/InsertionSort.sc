object InsertionSort {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def isort(xs : List[Int]) : List[Int] = {
  	xs match{
  		case Nil => Nil
  		case x :: xs1 => insert(x, isort(xs1))
  	
  	}
  
  }                                               //> isort: (xs: List[Int])List[Int]
  
  def insert(x : Int, xs : List[Int]) : List[Int] = {
  	
  	xs match{
  		case Nil => List(x)
  		case y :: xs1 =>
  			if(y >= x) x :: xs
  			else y :: insert(x,  xs1)
  	}
  	
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]
  
  
  isort(List(1, 6, 4, -2, 5, 12))                 //> res0: List[Int] = List(-2, 1, 4, 5, 6, 12)
}