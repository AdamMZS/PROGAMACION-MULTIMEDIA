package Ejercicio03

class ProductoFresco : Producto {

    private var fechaEnvasado: String = ""
    private var paisOrigen: String = ""

    constructor(
        fechaCaducidad: String,
        numeroLote: Int,
        fechaEnvasado: String,
        paisOrigen: String
    ) : super(fechaCaducidad, numeroLote) {

        this.fechaEnvasado = fechaEnvasado
        this.paisOrigen = paisOrigen
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Fecha de envasado: $fechaEnvasado")
        println("Pais de origen: $paisOrigen")
    }
}