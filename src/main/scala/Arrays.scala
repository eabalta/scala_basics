import scala.collection.mutable.ArrayBuffer

object Arrays {
  def main(args: Array[String]): Unit = {
    /*
        Array:
        1. Muttable'dir. Icerisindeki veriler guncellenebilmektedir.
        2. Boyutu degistirilemez.

     */

    // new Array[Type](size) seklinde array olusturulur.
    val arr = new Array[Int](10)
    arr(5) = 20
    arr.foreach(println)

    // foreach ile eleman arama
    var i = 0
    arr.foreach(x => {
      if(x == 20){
        println("20 su indextedir : " + i)
      }
      i +=1
    })

    // arr doldurma
    for(i <- arr.indices){
      arr(i) = i
    }
    arr.foreach(println)

    // Eger Array'e bir sey eklemek istiyorsak iki Arrayi toplayip yeni bir degerde tutmamiz gerekmektedir.
    // Toplama islemini '++' ile gerceklestiririz.
    val cat = Array("Nano")
    val cats = cat ++ Array("Loki")
    cats.foreach(println)

    // ArrayBuffer
    val fruits = ArrayBuffer[String]()

    // ArrayBuffer'a index ile eleman eklemek
    fruits.insert(0,"Apple")
    println("fruits : " + fruits)

    // Index belirtmeden eleman ekleme
    fruits += "Orange"
    println("fruits : " + fruits)

    // Array ile coklu eleman ekleme
    // Coklu eleman ekleme islemlerinde '++=' kullanilmaktadir.
    fruits ++= Array("Peach","Strawberry")
    println("fruits : " + fruits)

    // Insert ile coklu eleman ekleme
    fruits.insert(2, "Watermelon", "Melon")
    println("fruits : " + fruits)

    // ArrayBuffer yield
    val fruitsUpper = for(fruit <- fruits) yield fruit.toUpperCase()
    println("fruitsUpper : " + fruitsUpper)
  }
}
