package EJERCICIO03

fun main(){
    val letras = mutableMapOf<Char, Int>()
    println("Pon un texto el progama te leera todas las letras usadas y frecuencia de cada una")
    var leerTexto = readln()
    letras.clear()
    for(char in leerTexto) {
        if (char.isLetter()) {
            letras[char] = letras.getOrDefault(char, 0)+1
        }
    }
        val frecuenciaOrdenada=letras.toList().sortedByDescending { it.second}
        print ("Frecuencia de letras: ")
        for ((letra, frecuencia) in frecuenciaOrdenada){
            print("$letra: $frecuencia, ")
        }
}