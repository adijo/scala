object PatternMatching {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
 
 
 		def msort( xs : List[Int]) : List[Int] = {
 			val mid = (xs.length / 2)
 			if(mid == 0) xs
 			else{
 				val (fst, snd) = xs splitAt mid
 				merge(msort(fst), msort(snd))
 			}
 		}                                 //> msort: (xs: List[Int])List[Int]
 		
 		def merge(xs : List[Int], ys : List[Int]) : List[Int] = {
 				(xs, ys) match {
 					case (Nil, ys) => ys
 					case (xs, Nil) => xs
 					case (x :: xs1, y :: ys1) =>
 						  if(x > y) y :: merge(xs, ys1)
 						  else x :: merge(xs1, ys)
 			}
 		}                                 //> merge: (xs: List[Int], ys: List[Int])List[Int]

	msort(List(1, 6, 4, -2, 5, 12))           //> res0: List[Int] = List(-2, 1, 4, 5, 6, 12)



}