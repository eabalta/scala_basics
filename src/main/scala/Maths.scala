object Maths {
  def main(args: Array[String]): Unit = {

    println("100 + 500 =" + (100+500))

    println("5 mod 2 = ", 5%2)

    var number = 1000
    number+=1
    number-=1
    number*=3
    number/=7

    println(math.abs(-8))
    println(math.sqrt(8))
    print(math.pow(2,4))
    println(math.exp(1))    // e sayisi

    println("Round : " + math.round(2.34))
    println("Round : " + math.round(2.54))
    println("Floor : " + math.floor(2.54))
    println("Ceil : " + math.ceil(2.34))

    println(math.log(2))    // e tabaninda almaktadir.
    println(math.log10(10))

    println(math.min(2,5))
    println(math.max(2,5))

  }
}
