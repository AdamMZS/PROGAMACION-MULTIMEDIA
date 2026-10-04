package com.example.practica01ud02

fun main(){
    print("Que clima hace hoy¡")
    var clima=readln().toInt()
    when(clima) {
        1 -> print("Soleado")
        2-> print("Nublado")
        3-> print("Lluvioso")
        4-> print("Tormentoso")
        5-> print("Nevado")
        else -> print("Preguntale a Google")
    }
}