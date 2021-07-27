object Conditionals {
  def main(args: Array[String]): Unit = {

    /*
      Kosullu Ifadeler sunlardir;
        ==, !=, >, <, < >, <=, >=

      Mantiksal Ifadeler ise sunlardir;
        &&, ||, !
     */

    var yas = 23
    val arabaEhliyeti = if(yas >= 18) "alabilir." else "alamaz"
    println("Birey, araba ehliyeti " + arabaEhliyeti)

    var enYuksekhizLimiti = 120.0
    var enDusukHizLimiti = 40.0
    var surucuHizi = 150.0
    var surucu = "Murat"
    if((surucuHizi <= enYuksekhizLimiti) && (surucuHizi >= enDusukHizLimiti)){
      println(s"Sayın $surucu, yasal hız limitlerinde seyahat ediyorsunuz.")
    }else{
      println(s"Sayın $surucu, yasal hız limitleri dışında seyahat ediyorsunuz.")
    }


    if(yas < 12){
      println("Çocuk")
    }else if((yas >= 12) && (yas < 16)){
      println("Ergen")
    }else if((yas >= 16) && (yas < 22)){
      println("Delikanlı")
    }else if((yas >=22) && (yas < 33)){
      println("Genç")
    }else if((yas >= 33) && (yas < 50)){
      println("Ortayaş")
    }else{
      println("Yaşlı")
    }

  }
}
