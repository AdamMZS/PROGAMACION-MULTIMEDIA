package Ejercicio02

class Cuenta {
    private var numeroCuenta:String=""
    private var saldo: Double=0.0
    private var propietario: Persona= Persona("","",0)
    constructor(numeroCuenta: String,saldo: Double,propietario: Persona){
        this.numeroCuenta=numeroCuenta
        this.saldo=saldo
        this.propietario=propietario
    }
    constructor(){

    }
    fun transaccion(cantidad:Int,tipoTransaccion: TipoTransaccion){
    if (tipoTransaccion.equals(TipoTransaccion.Reintegro)){
        if (saldo>cantidad){
            saldo-=cantidad
        }else{
            print("No hay saldo suficiente")
        }
    }else{
        saldo+=cantidad
    }
    }
}