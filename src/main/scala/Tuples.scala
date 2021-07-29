object Tuples {
  def main(args: Array[String]): Unit = {

    // Scala icerisindeki Tuple, Python icerisindeki Tuple yapisiyla ayni islevi gormektedir.
    // Immutable'dir.

    var tupleI = (20,"Enes Alper",35, "Nano")

    // Tuple elemanlarina erismek biraz farkli yoldan gerceklestirilir.
    // Indexler 1. indexten baslayarak devam etmektedir.
    // 1. indexteki elemana ulasmak icin ise 'tuple._1' kullanmak gerekmektedir.
    // Diger indexlerdeki elemanlara da benzer sekilde ulasilmaktadir,

    println(tupleI._1)

    // Tuple Immutable oldugu icin eleman eklenemez.
    // tupleI += 34

    // toString ile Tuple yazdirilabilir.
    println(tupleI.toString())

    // Tuple icerisindeki her bir elemani da bir degiskene atayabiliriz.
    val (denizli,isim,izmir,isim2) = tupleI
    println(denizli + " " + isim + " " + izmir + " " + isim2)

    // Eger sadece belirli elemanlari almak istersek geri kalan elemanlar yerine _ kullaniriz.
    val(a,b,_,_) = tupleI
    println(a+ " " + b)

  }
}
