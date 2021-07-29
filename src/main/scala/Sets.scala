object Sets {
  def main(args: Array[String]): Unit = {

    // Set, Kume islemleri icin kullanilir.
    // Immutable ve Mutable olarak kullanilabilir.

    // Direkt olarak Set olusturuldugunda Immutable olarak olusturulur.
    val emptyImmutableSet = Set()

    // Set icerisinde her bir elemandan sadece bir tane tutulur.
    val ImmutSet = Set(1,1,1,2,2,3,5,5,4,4)
    println(ImmutSet)

    // Farkli veri tiplerini barindirabilir.
    val ImmutSet1 = Set("Denizli", 3.5, 3, "Izmir","Izmir","Niğde",true)
    println(ImmutSet1)

    // Setlerde Index yoktur ve sirasiz olarak depolanmaktadir.
    // Diger Collection nesneleri gibi elemana erisim yontemini ( collection(Index) ) kullanildiginda elemanin varligini bildiren boolean bir deger dondurmektedir.
    println("Set içinde 100 var mı? : " + ImmutSet1(100))
    println("Set içinde Izmir var mı? : " + ImmutSet1("Izmir"))

    // Set siralanmaz
    // ImmutSet1.sorted // hata vermektedir.

    // Mutable Set olusturmak diger elemanlara benzerdir.

    val MutSet = collection.mutable.Set(20,35,34)

    // Mutable Set icerisine iki farkli sekilde eleman eklenebilir.
    // += yontemiyle
    MutSet += 5
    // add metoduyla
    MutSet.add(81)

    // List elemanini Set'e donusturmek icin 'toSet' kullanilir.
    val list = List(1,1,2,3,4,4,5,6)
    val setFromList = list.toSet
    println("setFromList : " + setFromList)

    // Bilindigi uzere Set uzerinde kume islemleri de gerceklestirilir.

    // Kesisim icin intersect kullanilir.
    println("Kesisim / Intersect : " + setFromList.intersect(ImmutSet))

    // Iki kumenin farkini almak icin 'diff' kullanilir.
    println("setFromList - ImmutSet : " + setFromList.diff(ImmutSet))
    println("ImmutSet - setFromList : " + ImmutSet.diff(setFromList))

    // Iki kumenin birlesimini almak icin de 'union' kullanilir.
    println("Iki kume birlesimi / union : " + setFromList.union(ImmutSet))

  }
}
