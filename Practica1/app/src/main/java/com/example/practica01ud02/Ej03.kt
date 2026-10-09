package com.example.practica01ud02

fun main(){
    val pelis = arrayOf("Jumanji", "Toy Story", "Pulp Fiction", "Batman: El caballero de la noche", "Kill Bill")
    val mayorLongitud = pelis.maxByOrNull { it.length }
    println("Pelicula mas larga: $mayorLongitud")
}