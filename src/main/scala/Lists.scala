object Lists {
  def main(args: Array[String]): Unit = {

    // Listeler Immutable'dir.
    // Icerisinde farkli turde veriler tutabilir.

    val evens = List(2,4,6,8,10)
    println(evens)

    // Elemanlarina erismek icin parametre olarak 0'dan baslayan indexi vermek gerekmektedir.
    println(evens(3))

    // Immutable oldugu icin eleman degistirilemez
    // evens(3) = 12

    // Listenin uzunlugunu 'size' ile alabiliyoruz.
    println(evens.size)

    // Liste icerisindeki en buyuk ve en kucuk elemani max ve min ile alabiliyoruz.
    println(evens.max + " " + evens.min)

    // Farkli turde veri tipi de tututabilir.
    val l = List(1,"String", true,'C')
    println(l)

    // Liste uzerinde 'filter' ile filtreleme islemlerini gerceklestirebiliriz.
    // Iki farkli tipte ifade edebiliriz.
    // ilk olarak x degeri evens uzerinde iterasyon gerceklestirip kosulu kontrol eder.
    println("Higher than 8 " + evens.filter(x => x>8))
    // ikinci olarak da _ ifadesi this olarak nitelendirilebileceginden her bir elemani kosula sokmaktadir.
    println("Higher than 8 " + evens.filter(_>8))

    // 5'ten kucuk elemanlar uzerinde bir islem gerceklestirme
    println("_<5 * 10 : " + evens.filter(_<5).map(_*10))

    // Listenin toplami 'sum' ile gerceklestirilir.
    println("sum : " + evens.sum)

    // drop fonksiyonu ilk indexten baslayarak N kadar eleman dusurmektedir.
    val dropKey = 3
    println(s"$dropKey kadar eleman dusuruldu : " + evens.drop(dropKey))

    // Eger en sagdan belirli sayida eleman secmek istersek de 'takeRight' kullaniriz.
    println(evens.takeRight(3))

    // Listeyi siralamak icin de 'sorted' kullaniriz.
    println(evens.sorted)

    // Map ile elemanlar uzerinde islem gerceklestirilebilir.
    println(evens.map(x => x*x))

    // Zipleme islemi ayni uzunluktaki iki listenin elemanlarini karsilikli olarak birlestirir.
    // Ayni indexteki elemanlar ikili olarak tuple haline getirilir ve bu tuplelar tek liste halinda tutulur.

    val harfler = List("a","b","a","b","b")
    println(harfler.zip(evens))

  }
}
