object FizzBuzz {
  def generate(number: Int): String = {
      val intArray = Array.range(1, number+1)
      val fizzBuzzArray = intArray.map { x =>
        if (x % 3 == 0 && x % 5 == 0) "FizzBuzz"
        else if (x % 3 == 0) "Fizz"
        else if (x % 5 == 0) "Buzz"
        else x
      }
      fizzBuzzArray.mkString(", ")
  }
}