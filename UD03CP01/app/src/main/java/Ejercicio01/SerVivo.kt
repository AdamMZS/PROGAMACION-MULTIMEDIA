package Ejercicio01

open class SerVivo() {

     private var edad:Byte=0

    constructor(edad:Byte):this(){
        this.edad=edad
    }


    fun SerVivo(edad:Byte){
        this.edad=edad
    }
    override fun equals(other:Any?): Boolean{
        if (this === other) return true
        if (other !is SerVivo) return false
        return true
    }
    open fun mayor(other: SerVivo): SerVivo{
        if (this.edad > other.edad){
            return this
        }else{
            return other
        }
    }

    override fun toString(): String {
        return "SerVivo(edad=$edad)"
    }


}