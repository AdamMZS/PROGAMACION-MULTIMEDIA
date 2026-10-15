package Ejercicio02

class Persona {
    private var nombre: String = ""
    private var apellido: String = ""
    private var telefono: Int = 0
    constructor(nombre: String, apellido: String, telefono: Int) {
        this.nombre = nombre
        this.apellido = apellido
        this.telefono = telefono
    }

    override fun toString(): String {
        return "Persona(nombre='$nombre', apellido='$apellido', telefono=$telefono)"
    }

}