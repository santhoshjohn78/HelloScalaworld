object LoopExample {

  def forLoop():Unit ={

    for(i <- 1 to 10){
      println(s" value of i = $i")
    }
    println("**************************")
    for(i<-1 to 10;j<-1 to 5){
      println(s" value of i= $i j = $j")
    }
    println("**************************")
    var scores = List(10,12,33,56,66,72,80,75)

    for(i<-scores; if (i>=70)){
      println(s" scores above 70 = $i ")
    }

    val scoreSquares = for{i<-scores; if (i<70)} yield {
      i*i
    }
    println(scoreSquares)
  }

  def whileLoop(): Unit ={
    var i = 1;
    while(i<=10){
      println(s" value of i = $i")
      i+=1
    }

    do{
      println(s" value of i = $i")
      i-=1
    }while(i>5)

    println("*****************************")
  }

  def main(args: Array[String]): Unit ={
      whileLoop()
      forLoop()


  }
}
