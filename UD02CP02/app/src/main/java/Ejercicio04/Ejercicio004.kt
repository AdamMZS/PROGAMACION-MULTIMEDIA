package Ejercicio04

fun main(){
    println("Escriba su contrasenha")
    val contrasenha = readln()
    var contador:Int = 0
    if (contrasenha.length <8)
        println("La contrasenha debe tener al menos 8 caracteres")
        contador=1

    if (!contrasenha.any{it.isUpperCase()})
        println("La contrasenha debe tener al menos una letra mayuscula")
        contador=2
      if (!contrasenha.any{it.isLowerCase()})
        println("La contrasenha debe tener al menos una letra minuscula")
        contador=3
      if (!contrasenha.any{it.isDigit()})
        println("La contrasenha debe tener al menos un numero")
        contador=4
     if (!contrasenha.any{!it.isLetterOrDigit()})
        println("La contrasenha debe tener al menos un caracter especial")
        contador=5
    }

