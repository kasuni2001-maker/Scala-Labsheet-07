object Q2 {
  def main(args : Array[String]): Unit = {
    def calculateSquare(input: List[Int]): List[Int] = {
      input.map(number => number * number)
    }

    val numbers = List(1, 2, 3, 4, 5,6,7,8,9,10)
    val squares = calculateSquare(numbers)
    println(squares)
  }

}
