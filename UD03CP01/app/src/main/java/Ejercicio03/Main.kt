package Ejercicio03

fun main() {

    var productoFresco =
        ProductoFresco("10/12/2026", 1, "01/10/2026", "España")

    var productoRefrigerado =
        ProductoRefrigerado("15/12/2026", 2, "REF123")

    var productoCongelado =
        ProductoCongelado("20/12/2026", 3, -18.0)

    println("PRODUCTO FRESCO")
    productoFresco.mostrarInformacion()

    println()

    println("PRODUCTO REFRIGERADO")
    productoRefrigerado.mostrarInformacion()

    println()

    println("PRODUCTO CONGELADO")
    productoCongelado.mostrarInformacion()
}