package Ejercicio03

class ProductoRefrigerado : Producto {

    private var codigoOrganismo: String = ""

    constructor(
        fechaCaducidad: String,
        numeroLote: Int,
        codigoOrganismo: String
    ) : super(fechaCaducidad, numeroLote) {

        this.codigoOrganismo = codigoOrganismo
    }

    override fun mostrarInformacion() {
        super.mostrarInformacion()
        println("Codigo organismo: $codigoOrganismo")
    }
}