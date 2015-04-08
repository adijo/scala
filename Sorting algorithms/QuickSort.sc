import scala.util.Random

object QuickSort {

	def partition(x : Int, xs : List[Int], less : List[Int],  more: List[Int], equal : List[Int]) : (List[Int], List[Int], List[Int]) = {
  				xs match{
  					case Nil => (less, equal, more)
  					case head :: xs1 =>
  							if(head < x) partition(x, xs1, head :: less, more, equal)
  							else if(head == x) partition(x, xs1, less, more, head :: equal)
  							else partition(x, xs1, less, head :: more, equal)
  								
  	  				}
  }                                               //> partition: (x: Int, xs: List[Int], less: List[Int], more: List[Int], equal: 
                                                  //| List[Int])(List[Int], List[Int], List[Int])
 
   def qsort(xs : List[Int]) : List[Int] =
   {
    val rnd = Random
    
  		
  		if(xs.length / 2 == 0) xs
  		else{
  		
  			val pivot = rnd.nextInt(xs.length)
  			val (less, equal, more) = partition(xs(pivot), xs, List(), List(), List())
  			qsort(less)  ++ equal ++ qsort(more)
  		
  		}
  
  
  }                                               //> qsort: (xs: List[Int])List[Int]
  
   qsort(List(1, 6, 4, -2, 5, 12, 1))             //> res0: List[Int] = List(-2, 1, 1, 4, 5, 6, 12)
  
 
  
  
}