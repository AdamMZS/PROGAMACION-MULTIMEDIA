package Ejercicio02

fun main() {

    // Crear personas
    val persona1 = Persona("Adam", "Mzouri", 20)
    val persona2 = Persona("Juan", "Pérez", 25)

    // Crear cuentas
    val cuenta1 = Cuenta("ES12345", 1000.0, persona1)
    val cuenta2 = Cuenta("ES67890", 500.0, persona2)

    // Transacciones cuenta 1
    println("Transacciones de la cuenta 1:")
    cuenta1.transaccion(200, TipoTransaccion.Ingreso)
    println("Ingreso de 200€ realizado")
    cuenta1.transaccion(100, TipoTransaccion.Reintegro)
    println("Reintegro de 100€ realizado")

    println()

    // Transacciones cuenta 2
    println("Transacciones de la cuenta 2:")
    cuenta2.transaccion(300, TipoTransaccion.Ingreso)
    println("Ingreso de 300€ realizado")
    cuenta2.transaccion(150, TipoTransaccion.Reintegro)
    println("Reintegro de 150€ realizado")

    println()

    // Mostrar propietarios
    println("Propietario de la cuenta 1:")
    println(persona1)

    println()

    println("Propietario de la cuenta 2:")
    println(persona2)
}
