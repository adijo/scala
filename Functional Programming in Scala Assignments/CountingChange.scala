object CountingChange {

  def main(args : Array[String]){
   val coins = List(1, 2, 3)
   println(countChange(6, coins))
       
  }
  
  def countChange(money : Int, coins : List[Int]) : Int = {
       if(coins.isEmpty && money == 0) return 1
      else if(money < 0 || coins.isEmpty) return 0
      else  return countChange(money - coins.head, coins) + countChange(money, coins.tail)
      
    
  }
}