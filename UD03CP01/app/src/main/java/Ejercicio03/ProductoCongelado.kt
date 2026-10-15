package Ejercicio03

class ProductoCongelado : Producto {

    private var temperaturaCongelacion: Double = 0.0

    constructor(
        fechaCaducidad: String,
        numeroLote: Int,
        temperaturaCongelacion: Double
    ) : super(fechaCaducidad, numeroLote) {

        this.temperaturaCongelacion = temperaturaCongelacion
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Temperatura de congelacion: $temperaturaCongelacion")
    }
}