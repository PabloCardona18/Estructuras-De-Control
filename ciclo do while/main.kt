fun main(){
  print("ingrse un numero: ")
  val num1 = readLine()!!.toInt()
  var num2 =1
  do{
    if(num2 % 2 == 0){
      println(num2)
    }
    num2++
  }while(num2 <= num1)
}