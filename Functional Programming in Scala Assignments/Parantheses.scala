object Parantheses {
  
  def main(args : Array[String]){
   
       println(balance(":-)".toList))
  }
  
  def balance(chars : List[Char]) : Boolean = {
    
      def isBalanced(chars : List[Char], open : Int) : Boolean = {
          if(chars.isEmpty && open == 0) return true
          else if(chars.isEmpty && open != 0) return false
          else if(open < 0) return false
          else{
            if(chars.head == '(') return isBalanced(chars.tail, open + 1)
            else if(chars.head == ')') return isBalanced(chars.tail, open - 1)
            else return isBalanced(chars.tail, open)
            
          }
        
        
      }
      isBalanced(chars, 0)
    
  }

}