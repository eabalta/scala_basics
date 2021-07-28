object Functions {
  def main(args: Array[String]): Unit = {

    /*

    def fonksiyonAdi(parametre1:Turu, parametre2:Turu, ...): DonusVeriTuru ={
        fonksiyon kodlari
        return sonuc
    }

     */

    // Donus tipi 'Unit' olmasi Java'daki void ile ayni islevi tasimaktadir.

    def topla(sayi1:Int, sayi2:Int):Int={
      sayi1+sayi2
    }
    println(topla(3,5))

    // Return kullanilmasa bile Scala donus tipine uygun en son degeri dondurmektedir.
    def carp(sayi1:Int, sayi2:Int):Int={
      sayi1*sayi2
    }
    println(carp(2,5))

    // Birden fazla argumanla fonksiyon olusturmak
    // Parametre yerine gelecek olan parametreleri temsil etmek icin bir isim ve gelecek degerlerin hangi tipte oldugunu belirtiyoruz.
    // Daha sonra birden fazla parametre gelebilecegini belirtmek adina veri tipinin yanina * koyulur.
    def sayilariTopla(args: Int*):Int={
      var toplam = 0
      for(i<- args) toplam += i
      toplam
    }
    println(sayilariTopla(1,2,3,4,5))

    // Arrow Function olarak fonksiyon tanimlama
    val ikiSayiTopla = (x:Int, y:Int) => x+y
    println(ikiSayiTopla(5,10))

    def sumulti(x:Double, y:Double):(Double,Double)={
      (x+y, x*y)
    }
    println(sumulti(5,7))

    val sum, multi = sumulti(7,10)
    println("sum : " + sum + " multi : " + multi)

    // arrow
    val sumultiarrow = (x:Double, y:Double) => {
      (x+y, x*y)
    }

    val (x1,x2) = sumultiarrow(7.3,2.5)
    println((x1,x2))

  }
}
