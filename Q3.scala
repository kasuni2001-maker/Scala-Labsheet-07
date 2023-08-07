object Q3 {
  def main(args: Array[String]) {
    def filterPrime(n: List[Int]): List[AnyVal] = {
      var primeNum: List[AnyVal] = n.filter((x: Int) => prime(x) == true)
      return primeNum
    }

    def prime(num: Int, int: Int = 2): Boolean = {
      if (num < 2) {
        return false
      }
      else if (num == 2) {
        return true
      }
      else if (int * int > num) {
        return true
      }
      else if (num % int == 0) {
        return false
      }
      else {
        return prime(num, int + 1)
      }
    }

    println(filterPrime(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))

  }
}
