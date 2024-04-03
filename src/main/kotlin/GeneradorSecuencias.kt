package org.example

class GeneradorSecuencias(private val consola: Consola) {
    private lateinit var sec : Sequence<String>

    private fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readLine() }.take(limit)

    fun fraseIncremental(numero:Int){
        sec = lineSequence(numero)
        var frase = ""
        for (palabra in sec ){
            frase += if (frase.isEmpty()) palabra else " $palabra"
            mostrarSec(frase)
        }
    }

    fun fraseFinal(numero:Int){
        sec = lineSequence(numero)
        mostrarSec(getSec())
    }

    private fun getSec(): String {
        return sec.toList().joinToString(" ")
    }

    private fun mostrarSec(frase: String){
        consola.mostrar(frase, true)
    }
}
