object Strings {
  def main(args: Array[String]): Unit = {

    var str = "Nano muko bir kedi!"

    // Class ismini almak
    println(str.getClass.getName)

    // Belirli bir indexteki karakteri almak
    println(str(5))

    // for ile kelimeyi dolasmak
    for(harf <- str) print(harf)

    // foreach ile dolasma
    println()
    str.foreach(print)

    // substring alma islemi
    // verilen son index dahil edilmez
    println()
    println(str.substring(3,6))

    // contains
    println(str.contains("i"))
    println(str.contains("x"))

    // filter
    println("! yı filtrele: " + str.filter(_ != '!'))  // tek tırnak olmasına dikkat

    // concat
    println(str.concat("devamke"))

    // endsWith
    println(str.endsWith("!"))

    // HashCode
    println(str.hashCode)

    // length
    println(str.length)

    // replace
    println(str.replace("Nano", "Nanoş"))

    // split
    val splitted_str = str.split(" ")
    splitted_str.foreach(println)

    // split and remove blanks with map
    val comma_str = "milk, coke, bread"
    val cs = comma_str.split(",").map(_.trim)
    cs.foreach(println)

    val name = "Nano"
    val age = 0.5

    println(s"$name, 1.5 yil sonraki yasi ${age + 1.5} yasinda olacaktir")

    case class Cat(name:String,age:Float)
    val Nano = Cat("Nano",0.5F)

    println(s"$name, suan $age yasindadir.")


  }
}
