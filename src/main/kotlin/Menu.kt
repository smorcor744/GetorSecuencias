package org.example

class Menu(private val consola: Consola) {
    fun mostrarMenu() {
        consola.mostrar("Menu:", true)
        consola.mostrar("1. Frase incremental",true)
        consola.mostrar("2. Frase completa",true)
        consola.mostrar("3. Salir",true)
    }

    fun seleccionarOpcion(): Int {
        var opcion: Int
        while (true) {
            opcion = consola.leerNum("Selecciona una opción: ")
            if (opcion in 1..3) break
            else consola.mostrar("Opción no válida. Por favor, selecciona una opción del menú.")
        }
        return opcion
    }
}
