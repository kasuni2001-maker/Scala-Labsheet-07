object Q1 {

    def main(args: Array[String])
    {
      def filterEvenNumbers( y: List[Int]): List[AnyVal] = {
        var even: List[AnyVal] = y.filter((x: Int) => x % 2 == 0)
        return even
      }
      println(filterEvenNumbers(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    }
  }


