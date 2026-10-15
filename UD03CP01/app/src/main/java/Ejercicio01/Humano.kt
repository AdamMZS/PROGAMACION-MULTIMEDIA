package Ejercicio01

class Humano() : SerVivo() {
    private lateinit var nombre:String
    constructor(nombre:String, edad:Byte):this(){
        this.nombre=nombre
        super.SerVivo(edad)
    }
    override fun equals(other:Any?): Boolean{
        if (this === other) return true
        if (other !is Humano) return false
        return true
    }

    override fun toString(): String {

        return super.toString() + ", nombre='$nombre'"
    }


}