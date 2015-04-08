object Pascal {
  
    def main(args : Array[String]){
        println(pascal(1, 3))
  }
    
    def pascal(c : Int, r : Int) : Int = {
        if(r == 0 || c == 0 || c == r) return 1
        else return pascal(c, r - 1) + pascal(c - 1, r - 1)
      
    }
  

}