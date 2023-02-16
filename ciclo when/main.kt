funcionalidades when
fun main(){
  var estatura=2.09
  when(estatura){
    in 2.05..2.10 ->{
      println("usted es una persona muy grande:0")
      println("¿como se siente ver a los demas por debajo?")
    }
     in 1.90..2.00 -> println("usted e suna persona muy alta")
     in 1.70..1.80 -> println("usted es una persona promedio")
     in 1.40..1.50 -> println("usted es una persona muy baja")
  }
}