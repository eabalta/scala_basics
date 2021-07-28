object Loops {
  def main(args: Array[String]): Unit = {

    // while
    var i = 0
    while (i < 10){
      i+=1
    }

    // do while
    do {
      i-=1
    }while(i>0)

    // for
    // 'to' kullaniminda ilk ve son index de dahildir.
    for (i <- 0 to 10){     // 0 ve 10 dahil
      print(i)
    }

    // programlama dillerinde genel dongu mantiginda son index dahil edilmez.
    // Scala'da bunun icin 'until' tanimlanmistir.
    println()
    for(i <- 0 until 10){     // 0'dan 9'a kadar
      print(i)
    }

    // for ile List icerisinde gezinmek
    println()
    val list = List(0,20,"Denizli",35,"Izmir")
    for(i <- list){
      println(i)
    }

    // for ile Array icerisinde gezinmek
    val myArray = Array("Bir","İki","Üç",5)
    for (i <- myArray){
      println(i)
    }


    // for ile collection olusturmak
    // for blogu icerisinde her turda elde edilen i degeri 'yield' ile odds adli degisken icerisine yigilmaktadir.
    val odds = for{
      i <- 1 to 30
      if(i % 2) == 1
    }yield i

    // foreach ile yazdirma islemi gerceklestirirken collection elemenleri uzerinde hangi yazdirma fonksiyonunu cagiracagimizi soyluyoruz.
    odds.foreach(println)

    // foreach
    val fruits = List("Apple","Banana","Orange")
    fruits.foreach(x =>{
      println(x.toUpperCase)
    })

  }
}
