class Main {
  def main(args : Array[String]) : Unit = {
      val perm = new Permutation(List(1, 2, 3))
      println(perm.splitLists(List(5, 3, 2, 4)))
  }

}