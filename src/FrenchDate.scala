import java.util._
import java.text._

object FrenchDate {
  def main(args: Array[String]): Unit = {
    val now = new Date
    val df = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINESE)
    println(df format now)
  }
}
