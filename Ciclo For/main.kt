fun main() {
  print("ingrese la cantidad de numeros ingresados: ")
  val cantidad= readLine()!!.toInt()
  for(i in 1..cantidad){
    print("ingrese un numero: ")
    val numero=readLine()!!.toInt()
    if (numero % 11 == 0){
      println("el numero $numero es visible entre 11: ")
      }else{
      print("el numero $numero no es visible entre 11: ")
      }
  }
}