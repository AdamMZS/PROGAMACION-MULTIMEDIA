package Ejercicio03

open class Producto {

    private var fechaCaducidad: String = ""
    private var numeroLote: Int = 0

    constructor(fechaCaducidad: String, numeroLote: Int) {
        this.fechaCaducidad = fechaCaducidad
        this.numeroLote = numeroLote
    }

    fun getFechaCaducidad(): String {
        return fechaCaducidad
    }

    fun setFechaCaducidad(fechaCaducidad: String) {
        this.fechaCaducidad = fechaCaducidad
    }

    fun getNumeroLote(): Int {
        return numeroLote
    }

    fun setNumeroLote(numeroLote: Int) {
        this.numeroLote = numeroLote
    }

    open fun mostrarInformacion() {
        println("Fecha de caducidad: $fechaCaducidad")
        println("Numero de lote: $numeroLote")
    }
}