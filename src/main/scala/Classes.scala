
// Class tanimi yapmak icin 'class' anahtar kelimesi kullanilir.
// Classlar icerisine parametre alabilir.
class hi(firstText:String, lastText:String){
  def say(who: String): Unit =
    println(firstText + who + lastText)
}

object Classes {
  def main(args: Array[String]): Unit = {

    // Classtan bir instance olustururken new kullanilir.
    val sayhi = new hi("Hi,","!")
    sayhi.say("Kemal")

    val sayhi1 = new hi("Whats up, ","?")
    sayhi1.say("Francis")

    // Scala'ya ozel bir class tipi de bulunmaktadir.
    // Case Class olan bu class tipi, Inner Class benzeri fakat cok daha pratik ve hizli sinif olusturma islemini gerceklestirmektedir.
    // Case Class uzerinden bir instance olusturulurken new kullanmaya gerek yoktur.
    // Case Class olusturmak icin;
    // 'case class' anahtar kelimesi kullanilir.
    // Class ismi yazilir.
    // Parantez icerisinde alacagi parametreler yazilir.

    case class Point(x: Int , y:Int)

    val point1 = Point(1,2)
    val point2 = Point(1,2)

    if(point1 == point2) println("Points are same")

    case class Student(name:String, grade:Float)

    val student1 = Student("Enes Alper Balta", 3.54F)
    println(s"${student1.name}'s grade is ${student1.grade}")

    // Case Class olustururken parametrelere Default degerler de atanabilmektedir.
    // Atamak icin parametrelerin tipinden sonra = koyularak default  degerler atanir.
    case class Worker(name:String = "No Name", title:String = "No Title", salary:Int = 0)

    val emptyWorker = Worker()

    val worker = Worker("Kerem", "Software Developer", 8000)

    println(s"Empty Worker : ${emptyWorker.name} - ${emptyWorker.title} - ${emptyWorker.salary}")
    println(s"Worker : ${worker.name} - ${worker.title} - ${worker.salary}")

  }
}
