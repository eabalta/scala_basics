object Maps {
  def main(args: Array[String]): Unit = {

    // Maps, Python icerisindeki Dictionary benzeri bir yapiya sahiptir.
    // Key-Value ikilisi olarak degerlerini tutmaktadir.
    // Immutable ve mutable olabilmektedir.

    // Immutable Map
    // Map varsayilan bir sekidle immutable olarak olusmaktadir.

    // Key Value ikililerinin iki farkli tanimlama yontemi bulunmaktadir.
    // Ilki Key -> Value
    val capital = Map("Japan" -> "Tokio", "India" -> "Delhi" , "South Korea" -> "Seul")

    // Ikincisi tuple seklinde (Key,Value)
    val capital2 = Map(("USA","Washington"),("France","Paris"))

    // Eger Map icerisinden Key ile bir Value almak istersek Map nesnesine parametre vererek elde edebiliriz.
    var key = "India"
    if(capital.contains(key)) println(s"Capital city of $key is ${capital(key)}")

    // Immutable Map nesnesine bir eleman eklemek istersek hata aliriz.
    // capital("Germany") = "Berlin"

    // Mutable Map

    // Mutable bir Map nesnesi olusturmak icin collection.mutable.Map uzerinden nesne olusturmak gerekmektedir.
    val capitalMutable = collection.mutable.Map("Japan" -> "Tokio", "India" -> "Delhi" , "South Korea" -> "Seul")

    // Mutable Map icerisine eleman eklemek istersek Map nesnesine parametre olarak Key verilir esitligin karsisina da Value verilir.
    capitalMutable("Germany") = "Berlin"
    key = "Germany"
    if(capitalMutable.contains(key)) println(s"Capital city of $key is ${capitalMutable(key)}")


    val plates = collection.mutable.Map(20->"Denizli",35->"Izmir",34->"Istanbul")

    // for dongusu ile Key-Value yazdirmak
    for((key,value) <- plates){
      printf("%d : %s \n",key,value)
    }

    // Map icerisinden Key ile Value almak icin
    println(plates(20))
    // Eger bu sekilde Map icerisinde olmayan bir degeri almaya kalkarsak Exception hatasi firlatilir.
    // println(plates(81))
    // Bu hatayi almamak icin 'get' fonksiyonu kullanilir. Eger deger bulunmuyorsa None dondurur.
    println(plates.get(81))

    // Key degerlerini elde etmek icin .keys attributeu kullanilir.
    println(plates.keys)

    // Value degerlerini elde etmek icin .values attributeu kullanilir.
    println(plates.values)

  }
}
