// Scala uzerinde matematiksel islemleri gerceklestirebilmek adina ScalaNLP tarafindan gelistirilen 'breeze' kullanacaginiz.
import breeze.stats._
import org.apache.spark.ml.linalg.{Vectors, _}

object VectorOps {
  def main(args: Array[String]): Unit = {
    // Vectorler istatistik ve makine ogrenmesinde sikca kullanilan sirali sayi dizileridir.

    // Bir Vector olusturmak istiyorsak ml.linalg.Vectors.dense icerisine Array olarak degerlerimizi verebiliriz.
    val zeroVector = Vectors.dense(Array(0.0,0.0,0.0,0.0))
    println(zeroVector)

    // Sifirlardan olusan bir vector olusturmak istersek Vectors.zeros kullaniliriz.
    val zeroVector2 = Vectors.zeros(5)
    println(zeroVector2)

    // Index olarak elemanlarina ulasmak istersek Collectionlar uzerindeki ayni islemi gerceklestiriyoruz.
    println("4. index'e ulasildi : " + zeroVector2(4))

    // Vector'u DenseVector'e donusturme islemi toDense ile gerceklestirilir.
    val denseVector = zeroVector.toDense
    val denseVector2 = zeroVector2.toDense
    println(denseVector)
    println(denseVector2)

    // Bir Array uzerinden direkt olarak DenseVector olusturamiyoruz.
    //val denseVectorFromArray = DenseVector(Array(1,2,3))

    // Vectors uzerinden de iki farkli sekilde DenseVector olusturulabilir.
    // Vectors uzerinden Dense cagirilip Array verildikten sonra toDense ile DenseVectore donusturulerek
    val ageVector = Vectors.dense(Array(37.0,42.0,55.0,28.0)).toDense
    // Dense icerisine direkt olarak da veriler verilebilir.
    val ageVector2 = Vectors.dense(35.0,27.0,49.0,23.0).toDense

    // Bir ml.linalg.DenseVector ortalamasını almak istiyorsak breeze.stats.mean kullanıyoruz.
    // Ayrıca denseVector'ü arraye cevirmemiz gerekmektedir.
    println("ageVector ortalamasi: " + mean(ageVector.toArray))

    // Bir ml.linalg.DenseVector standart sapmasını almak istiyorsak breeze.stats.stddev kullanıyoruz.
    // Ayrıca denseVector'ü arraye cevirmemiz gerekmektedir.
    println("ageVector standart sapmasi : " + stddev(ageVector.toArray))


    // Varyans Degeri
    println("ageVector: " + variance(ageVector.toArray))
    println("ageVector2: " + variance(ageVector2.toArray))

    // Vectorler arasi mesafe
    println("İki vektör arasındaki mesafe: " + Vectors.sqdist(ageVector, ageVector2))

    def kovaryansHesapla(x:DenseVector, y:DenseVector):Double= {
      var kovaryans:Double = 0.0
      val xMean = mean(x.toArray)
      val yMean = mean(y.toArray)
      var total = 0.0
      val n = x.size.toDouble
      for (i <- 0 until x.size){
        total += ((x(i) - xMean) *(y(i) - yMean) )
      }
      kovaryans = (1.0/n)*total
      kovaryans
    }

    println("Kovaryans: " + kovaryansHesapla(ageVector, ageVector2))

    def korelasyonHesapla(x:DenseVector, y:DenseVector):Double= {

      var kovaryans = kovaryansHesapla(x,y)

      val korelasyon = kovaryans /(stddev(x.toArray) * stddev(y.toArray))

      korelasyon
    }

    // İki vektörün korelasyonu
    println("Korelasyon: " + korelasyonHesapla(ageVector,ageVector2))

  }
}







