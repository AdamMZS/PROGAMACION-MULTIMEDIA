package Ejercicio05

import kotlin.collections.get

fun main() {
    val filas = mutableMapOf<String, Boolean>(
        "A1" to false, "A2" to false, "A3" to false, "A4" to false, "A5" to false,
        "B1" to false, "B2" to false, "B3" to false, "B4" to false, "B5" to false,
        "C1" to false, "C2" to false, "C3" to false, "C4" to false, "C5" to false,
        "D1" to false, "D2" to false, "D3" to false, "D4" to false, "D5" to false,
        "E1" to false, "E2" to false, "E3" to false, "E4" to false, "E5" to false
    )

    var opcion: Int

    do {
        println("1. Mostrar asientos")
        println("2. reservar asiento")
        println("3. cancelar reserva")
        println("4. Salir")

        try {
            opcion = readLine()?.toInt() ?: 0
        } catch (e: Exception) {
            println("Debes introducir un numero")
            opcion = 0
        }
        if (opcion == 1) {
            println("Sala de cine : ${filas.keys}")

        } else if (opcion == 2) {
            println("Que asiento quieres reservar?")

            val entrada: Any? = readLine()
            val asiento = entrada as? String

            if (filas.containsKey(asiento)) {
                if (filas[asiento] == false) {
                    filas[asiento!!] = true
                    println("Asiento reservado")
                } else {
                    println("Ese asiento ya esta ocupado")
                }
            } else {
                println("Ese asiento no existe")
            }

        } else if (opcion == 3) {
            println("Que asiento quieres cancelar?")

            val entrada: Any? = readLine()
            val asiento = entrada as? String

            if (filas.containsKey(asiento)) {
                if (filas[asiento] == true) {
                    filas[asiento!!] = false
                    println("Asiento cancelado")
                } else {
                    println("Ese asiento ya esta libre")
                }
            } else {
                println("Ese asiento no existe")
            }

        } else {
            if (opcion != 4)
                println("Opcion no valida")
        }

    } while (opcion != 4)
}