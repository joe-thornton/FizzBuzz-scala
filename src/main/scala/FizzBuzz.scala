object FizzBuzz {
  def generate(number: Int): String = {
      val intArray = Array.range(1, number+1)
      val stringArray = intArray.map { x =>
        if (x % 3 == 0) {
          "Fizz"
        } else if (x % 5 == 0) {
          "Buzz"
        }
        else x
      }
      stringArray.mkString(", ")
  }
}