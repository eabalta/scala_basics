object training {
  def main(args: Array[String]): Unit = {

    // 1. 3'ün 7'nci kuvveti kaçtır?
    println("3**7\t\t=\t" + math.pow(3,7))
    // 2. 1264 sayısının karekökünü alınız ve sonucun ondalık kısmını iki basamak olarak gösteriniz.
    printf("sqrt(1264)\t=\t%.2f\n",math.sqrt(1264))
    // 3. 133 sayısının 5'e bölümünde kalan kaçtır?
    println("133 Mod 5\t=\t" + (133 % 5))
    // 4. 9,5,15,9,63,7,88,25,5,79,15,15,121,9,7,15 elemanlarından oluşan bir listeniz var. Bu listede tekrarlanan elemanları çıkararak küçükten büyüğe sıraya sokunuz.
    println(List(9, 5, 15, 9, 63, 7, 88, 25, 5, 79, 15, 15, 121, 9, 7, 15).distinct.sorted)
    // 5. ("Ali",5,(8,9),123, ("Cemal","Fatma"),23) Tuple içinde Fatma'ya erişiniz.
    val tuple = ("Ali",5,(8,9),123, ("Cemal","Fatma"),23)
    println(tuple._5._2)
    // 6. 0 ile 1 arasında her seferinde aynı rassal değeri alan bir ondalıklı sayı üretiniz.
    val rand = scala.util.Random
    rand.setSeed(1L)
    println(rand.nextFloat())
    // 7. "kjlsdlklkdslksdlkdslksd" içinde ksd örüntüsünün kaç kez tekrarlandığını bulunuz.
    var str = "kjlsdlklkdslksdlkdslksd"
    val key = "ksd"
    var count = 0
    while(str.contains(key)){
      str = str.replaceFirst(key,"")
      count+=1
    }
    println(count)
  }
}
