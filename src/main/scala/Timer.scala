object Timer {

  def callTimer(sex: String): Unit ={
    var name: String = "sadsd"
    var greeting: String = s"Hello $name";
    if (sex=="F")
      greeting = s"Hello Ms $name"
    else
      greeting = s"Hello Mr $name"

    println(greeting)

  }

  def calAvg(): Unit ={
    val x = { val a=100; val b=200; a+b}
    println(x)

  }
  def main(args: Array[String]): Unit ={
    println("Hi")
    callTimer("f")
    calAvg()
  }
}
