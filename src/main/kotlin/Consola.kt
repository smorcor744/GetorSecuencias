package org.example

open class Consola:IEntradaSalida {
    override fun mostrar(mensaje: String, salto:Boolean){
        if(salto) println(mensaje) else print(mensaje)
    }


    override fun leerNum(mensaje: String): Int {
        var num: Int
        while (true) {
            try {
                mostrar(mensaje)
                num = readln().toInt()
                break
            } catch (e: NumberFormatException) {
                mostrar("Por favor, introduce un número válido.\n")
            }
        }
        return num
    }

    override fun leer(): String {
        mostrar("Introduce una palabra o letra: ")
        return readln()
    }
}