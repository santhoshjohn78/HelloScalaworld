object Timer {

  def getNamePrefix(sex: String): String ={
    if ("f".equalsIgnoreCase(sex) || "female".equalsIgnoreCase(sex))
      "Ms"
    else
      "Mr"
  }

  def callTimer(sex: String): Unit ={
    var name: String = "sadsd"
    val prefix = getNamePrefix(sex)
    var greeting: String = s"Hello $prefix $name";

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
