fun main(){
  println("ingrese el valor de la compra: ")
  var valorcompra =readLine()!!.toDouble()
  println("valor compra: $valorcompra")
  var descuento:Double
  if(valorcompra >= 100000){
    descuento = valorcompra * 0.5
    valorcompra -= descuento
    println("se aolico un descuento del 50% su descuento es de: $descuento: ")
  }
}