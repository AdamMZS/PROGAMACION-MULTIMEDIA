package Ejercicio01

fun main(){
    val serVivo = SerVivo(3)
    val serVivo2= SerVivo(5)
    println(serVivo.mayor(serVivo2))
    val humano = Humano("Homero", 34)
    val humano2=Humano ("Bart",9)
    println(humano.mayor(humano2))
}