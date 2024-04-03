package org.example


fun main() {
    val consola = Consola()
    val generadorSecuencias = GeneradorSecuencias(consola)

    var numero: Int
    while (true) {
        numero = consola.leerNum("Introduce un número: ")
        if (numero > 0) break
        else consola.mostrar("Por favor, introduce un número válido mayor que cero.")
    }

    generadorSecuencias.fraseIncremental(numero)
}
