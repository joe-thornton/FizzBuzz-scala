object FizzBuzz {
  def generate(number: Int): String = {
    if (number == 1) {
      "1"
    } else if (number == 2) {
      "1, 2"
    } else {
      val intArray = Array.range(1, number+1)
      val stringArray = intArray.map { x =>
        if (x % 3 == 0) {
          "Fizz"
        } else x
      }
      stringArray.mkString(", ")
    }
  }
}