import math._
import scala.collection.immutable.Range
import scala.util.Random

object DataTypes {
  def main(args: Array[String]): Unit = {

    // 1. Boolean
    println("Boolean Degerler: " + true+ " " + false)

    // 2. Char
    val char:Char = '!'

    // 3. Byte
    println("Byte " + Byte.MinValue + " ile " + Byte.MaxValue + " arasinda deger almaktadir.")
    val myByte:Byte = 127
    // val myByte:Byte = 128 hata vermektedir.

    // 4. Short
    println("Short " + Short.MinValue + " ile " + Short.MaxValue + " arasinda deger almaktadir.")
    val myShort:Short = 32767
    // val myShort:Short = 32768 hata vermektedir.

    // 5. Int
    println("Int " + Int.MinValue + " ile " + Int.MaxValue + " arasinda deger almaktadir.")

    // 6. Long
    println("Long " + Long.MinValue + " ile " + Long.MaxValue + " arasinda deger almaktadir.")

    // 7. Float
    println("Float " + Float.MinValue + " ile " + Float.MaxValue + " arasinda deger almaktadir.")

    // 8. Double
    println("Double " + Double.MinValue + " ile " + Double.MaxValue + " arasinda deger almaktadir.")

    // 9. BigInt
    // Cok buyuk sayilar icin kullanilmaktadir.
    println("BigInt " + BigInt(98798654654321654L))

    // 10. BigDecimal
    // Cok buyuk ondalikli sayilar icin kullanilmaktadir.
    println("BigDecimal " + BigDecimal(1.12314234235435))


    /*
            Type Conversion

            Byte -> Short -> Int -> Long -> Float -> Double

            Buyuk veriden kucuge donusumde truncate olusmaktadir.
     */

    val dbMax = Double.MaxValue
    println("DoubleMax : " + dbMax + ", Double to Int : "+ dbMax.toInt)

    val intMax = Int.MaxValue
    println("IntMax : " + intMax + ", Int to Double : "+ intMax.toDouble)

  }
}
