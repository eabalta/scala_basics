import breeze.linalg.sum
import org.apache.spark.ml.linalg._
object MatrixOps {
  def main(args: Array[String]): Unit = {

    // Sifirlardan olusan bir matris yaratmak icin Matrices.zeros(row,col)
    val zeroMatrix = Matrices.zeros(5,3)
    println("zeroMatrix : \n" + zeroMatrix)

    // Birlerden olusan bir matris yaratmak icin Matrices.ones(row,col)
    val oneMatrix = Matrices.ones(3,5)
    println("oneMatrix : \n" + oneMatrix)

    // Bir array uzerinden matris yaratmak icin Matrices.dense(row,col,Array...)
    // Array uzerinden matris olusturuldugunda degerler sutun sutun yerlestirilmektedir !
    val arrayMatrix = Matrices.dense(3,3,Array(1,2,3,4,5,0,7,8,9)).toDense
    println("arrayMatrix : \n" + arrayMatrix)

    // Matrisin transpose'unu almak icin olusturulan matrisin transpose attributei cagirilir.
    println("arrayMatrix Transpose : \n" + arrayMatrix.transpose)

    // Bir matris icerisinde sifir olmayan degerlerin sayisini bulmak icin numNonzeros
    println("arrayMatrix icerisinde sıfır olmayan değer sayısı: " + arrayMatrix.numNonzeros)

    // Matrisin satir sayisi icin numRows , sutun sayisi icin numCols
    println("Satır ve sütun sayısı: " + arrayMatrix.numRows, arrayMatrix.numCols)

    // Matris elemanlarinin toplami icin breeze altindan dahil ettigimiz sum fonksiyonuni kullaniriz.
    println("Matrisin elemanlarının toplamı: " + sum(arrayMatrix.toArray))

    // Matrisin diagonel kosegenine deger verip diger elemanlari sifir olacak sekilde bir matris olusturmak icin Matrices.diag kullanilir.
    val fromDiagonalMatrix = Matrices.diag(Vectors.dense(Array(1.0,4,7,11,9)))
    println("Diagonal Matrix : \n" + fromDiagonalMatrix)

    // Birim matris olusturmak icin Matrices.eye kullanilir.
    val eyeMatrix = Matrices.eye(3).toDense
    println("Birim Matris : \n" + eyeMatrix)

    // Matrislerin carpimi, var olan bir matrisin .multiply fonksiyonuna parametre olarak ikinci bir matrisi vererek elde edilir.
    val arrayMatrix2 = Matrices.dense(3,3,Array(3,5,7,9,11,13,15,17,19)).toDense
    val multipliedMatrix = arrayMatrix.multiply(arrayMatrix2)
    println("arrayMatrix * arrayMatrix2 = \n" + multipliedMatrix)

  }
}
