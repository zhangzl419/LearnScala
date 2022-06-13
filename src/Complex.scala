
class Complex(real: Double, imaginary: Double) {
  def re(): Double = {
    return real
  }

  def im() = imaginary
}



object ComplexNumbers {
  def main(args: Array[String]): Unit = {
    val c = new Complex(1.2, 3.4)
    println("Imaginary Part: " + c.im())
  }
}