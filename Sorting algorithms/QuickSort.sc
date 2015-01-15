import scala.util.Random

object QuickSort {

 def partition(x : Int, xs : List[Int], less : List[Int],  more: List[Int]) : (List[Int], List[Int])= {
  				xs match{
  					case Nil => (less, more)
  					case head :: xs1 =>
  							if(head <= x) partition(x, xs1, head :: less, more)
  							else partition(x, xs1, less, head :: more)
  								
  	  				}
  }

   def qsort(xs : List[Int]) : List[Int] = {
  		
  		if(xs.length / 2 == 0) xs
  		else{
  		
  			val pivot = rnd.nextInt(xs.length)
  			val (less, more) = partition(xs(pivot), xs, List(), List())
  			qsort(less) ++ qsort(more)
  		
  		}
  
  
  }
  
  val rnd = Random
  qsort(List(5, 6, 4, 1, 3, -2) )
  
  
}