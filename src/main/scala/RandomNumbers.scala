import scala.util.Random
object RandomNumbers {
  def main(args: Array[String]): Unit = {

    val rand = Random

    // Int
    println(rand.nextInt())

    // 0 ile verilen parametre degeri arasinda Int olusturulur.
    println(rand.nextInt(100))

    // 0 ile 1 arasinda float
    println(rand.nextFloat())

    // 0 ile 1 arasinda double
    println(rand.nextDouble())

    // Random nesnesine Seed verilerek ciktilarin ayni kalmasi saglanir
    rand.setSeed(1L)
    println(rand.nextInt(100)) // Yukaridaki nextInt surekli farkli cikti uretirken Seed belirlendikten sonra cikti degeri degismiyor.

    // Random Char
    println(rand.nextPrintableChar())

    // Random String
    println(rand.nextString(5))

  }
}
