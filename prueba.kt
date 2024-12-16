import kotlin.math.PI

fun main() {
    while (true) {
        println("\nEscoja la función que desea realizar:")
        println("1. Área de un cuadrado")
        println("2. Área de un círculo")
        println("3. Área de un triángulo")
        println("4. Salir")

        val opcion = readLine()?.toIntOrNull()
        if (opcion == null || opcion !in 1..4) {
            println("Por favor, ingrese una opción válida.")
            continue
        }

        when (opcion) {
            1 -> {
                println("Ingrese la base del cuadrado:")
                val base = readLine()?.toDoubleOrNull()
                println("Ingrese la altura del cuadrado:")
                val altura = readLine()?.toDoubleOrNull()
                if (base != null && altura != null) {
                    println("El área del cuadrado es: ${base * altura}")
                } else {
                    println("Entrada inválida. Intente de nuevo.")
                }
            }
            2 -> {
                println("Ingrese el radio del círculo:")
                val radio = readLine()?.toDoubleOrNull()
                if (radio != null) {
                    println("El área del círculo es: ${PI * radio * radio}")
                } else {
                    println("Entrada inválida. Intente de nuevo.")
                }
            }
            3 -> {
                println("Ingrese la base del triángulo:")
                val base = readLine()?.toDoubleOrNull()
                println("Ingrese la altura del triángulo:")
                val altura = readLine()?.toDoubleOrNull()
                if (base != null && altura != null) {
                    println("El área del triángulo es: ${(base * altura) / 2}")
                } else {
                    println("Entrada inválida. Intente de nuevo.")
                }
            }
            4 -> {
                println("Saliendo del programa...")
                break
            }
        }
    }
}
