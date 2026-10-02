package com.example.practica01ud02

fun main(){
    print("Introduzca el numero")
    var opcion=readln().toInt()
    var suma=0
    for (i in 1.. opcion){
        print("$i+")
        suma+=i
    }
    println("La suma es $suma")
    var aux=1
    var sumawhile=0
    while (aux<=opcion){
        print("$aux+")
        sumawhile+=aux
        aux++
    }
    println("La suma es $sumawhile")
}