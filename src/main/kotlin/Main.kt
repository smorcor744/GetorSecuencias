package org.example

fun main() {
    val consola = Consola()
    val generadorSecuencias = GeneradorSecuencias(consola)
    val menu = Menu(consola)

    var opcion: Int
    do {
        menu.mostrarMenu()
        opcion = menu.seleccionarOpcion()
        when (opcion) {
            1 -> {
                var numero: Int
                while (true) {
                    numero = consola.leerNum("Introduce un número: ")
                    if (numero > 0) break
                    else consola.mostrar("Por favor, introduce un número válido mayor que cero.")
                }
                generadorSecuencias.fraseIncremental(numero)
            }
            2 -> {
                var numero: Int
                while (true) {
                    numero = consola.leerNum("Introduce un número: ")
                    if (numero > 0) break
                    else consola.mostrar("Por favor, introduce un número válido mayor que cero.")
                }
                generadorSecuencias.fraseFinal(numero)
            }
            3 -> consola.mostrar("Saliendo del programa...")
        }
    } while (opcion != 3)
}
