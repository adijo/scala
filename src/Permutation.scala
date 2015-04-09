class Permutation(xs : List[Int])
{
  
    def splitLists(xs : List[Int]) : (List[Int], List[Int]) = {
        def splitListsHelper(xs : List[Int], acc : List[Int]) : (List[Int], List[Int]) = {
            xs match {
              case x :: Nil => (x :: acc, Nil)
              case x :: y :: Nil =>
                if(x <= y) (x :: y :: acc, Nil)
                else (x :: acc, List(y))
                
              case x :: y :: xs1 =>
                if(x <= y) splitListsHelper(xs.tail, x :: acc)
                else (x :: acc, xs.tail)
            }
          
        }
        splitListsHelper(xs, List())
    }

}