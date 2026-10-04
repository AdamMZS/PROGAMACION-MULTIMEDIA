package com.example.practica01ud02

import java.util.Scanner

fun main(){
    print("Introduzca el numero de la pocion")
    val pocion = readln()?.toInt()?:0
    if (pocion>100){
        println("¡Felicidades, es una buena poción!")
    }else
        println("La poción es mediocre, sangre sucia inmunda")
    }