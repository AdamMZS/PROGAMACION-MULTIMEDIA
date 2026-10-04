package com.example.practica01ud02

fun main(){
    var disponible: Boolean
    var auxWhile: Boolean=false
    do{
        var auxDis :String
        var distancia: Double
    print("Esta disponible el conductor")
    auxDis = readln()
    disponible=auxDis.lowercase()=="si"
    print ("Cual es tu distancia al conductor")
    distancia= readln().toDouble()
    if (distancia>0.5 && disponible){
        println("Conductor disponible pero muy lejos,\n" +
                "aplicarán tarifas más altas")
        auxWhile=true
    }else if(distancia<0.5 && disponible) {
        println("Listo para iniciar recorrido")
        auxWhile =false
    }
    else if(distancia<0.5 && !disponible) {
        print(
            "Conductor cercano, pero no\n" +
                    "disponible"
        )
        auxWhile = true
    }
        else {
        println("No hay conductores disponibles")
        auxWhile=true

    }
    }while(auxWhile)

}