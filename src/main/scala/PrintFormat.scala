object PrintFormat {
  def main(args: Array[String]): Unit = {

    val isim = "Nano"
    val yas = 1
    val boy = 0.75

    // Metin icerisine String yazdiracaksak String oncesine 's' koyulur.
    println(s"Merhaba $isim")

    // Metin icerisine Float yazdiracaksak String oncesine 'f' koyulur.
    println(f"$isim, $boy%.3f boyundadir.")

    // Metin icerisine bir islem yapilacaksa $ isaretinden sonra {} kullanilmalidir.
    println(f"$isim, suan ${yas-0.5}%.2f yasindadir.")

    // Sayinin formatini belirtebilmek icin printf kullanilir.
    printf("%d", 5)
    println()
    // 5'in soluna belirlenen rakama kadar sıfır ekleme
    printf("%02d",5)
    println()
    // 55 olsaydı hiç eklenemezdi çünkü sınır 2 basamak
    printf("%02d",55)
    println()
    // Şimdi daha fazla sıfır ekleyelim
    printf("%010d",55)
    println()
    printf("%.3f", 5.1)

  }
}
