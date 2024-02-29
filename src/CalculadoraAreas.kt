import kotlin.math.*

fun calcularAreaRetangulo(base: Double, altura: Double): Double {
    return base * altura
}

fun calcularAreaTriangulo(base: Double, altura: Double): Double {
    return (base * altura) / 2
}

fun calcularAreaTrianguloEquilatero(lado: Double): Double {
    return (sqrt(3.0) / 4) * lado * lado
}

fun calcularAreaTrianguloIsoceles(base: Double, lado: Double): Double {
    val altura = sqrt(lado * lado - (base / 2) * (base / 2))
    return (base * altura) / 2
}

fun calcularAreaTrianguloEscaleno(lado1: Double, lado2: Double, lado3: Double): Double {
    val s = (lado1 + lado2 + lado3) / 2
    return sqrt(s * (s - lado1) * (s - lado2) * (s - lado3))
}

fun calcularAreaCircunferencia(raio: Double): Double {
    return PI * raio * raio
}

fun calcularAreaLosango(diagonalMaior: Double, diagonalMenor: Double): Double {
    return (diagonalMaior * diagonalMenor) / 2
}

fun calcularAreaTrapezio(baseMaior: Double, baseMenor: Double, altura: Double): Double {
    return ((baseMaior + baseMenor) * altura) / 2
}

fun main() {
    println("Escolha a opção para calcular a área:")
    println("1. Retângulo")
    println("2. Triângulo")
    println("3. Triângulo Equilátero")
    println("4. Triângulo Isósceles")
    println("5. Triângulo Escaleno")
    println("6. Circunferência")
    println("7. Losango")
    println("8. Trapézio")

    val opcao = readLine()?.toInt() ?: return

    when (opcao) {
        1 -> {
            println("Informe a base do retângulo:")
            val base = readLine()?.toDouble() ?: return
            println("Informe a altura do retângulo:")
            val altura = readLine()?.toDouble() ?: return
            println("Área do Retângulo: ${calcularAreaRetangulo(base, altura)}")
        }
        2 -> {
            println("Informe a base do triângulo:")
            val base = readLine()?.toDouble() ?: return
            println("Informe a altura do triângulo:")
            val altura = readLine()?.toDouble() ?: return
            println("Área do Triângulo: ${calcularAreaTriangulo(base, altura)}")
        }
        3 -> {
            println("Informe o lado do triângulo equilátero:")
            val lado = readLine()?.toDouble() ?: return
            println("Área do Triângulo Equilátero: ${calcularAreaTrianguloEquilatero(lado)}")
        }
        4 -> {
            println("Informe a base do triângulo isósceles:")
            val base = readLine()?.toDouble() ?: return
            println("Informe o lado do triângulo isósceles:")
            val lado = readLine()?.toDouble() ?: return
            println("Área do Triângulo Isósceles: ${calcularAreaTrianguloIsoceles(base, lado)}")
        }
        5 -> {
            println("Informe o primeiro lado do triângulo escaleno:")
            val lado1 = readLine()?.toDouble() ?: return
            println("Informe o segundo lado do triângulo escaleno:")
            val lado2 = readLine()?.toDouble() ?: return
            println("Informe o terceiro lado do triângulo escaleno:")
            val lado3 = readLine()?.toDouble() ?: return
            println("Área do Triângulo Escaleno: ${calcularAreaTrianguloEscaleno(lado1, lado2, lado3)}")
        }
        6 -> {
            println("Informe o raio da circunferência:")
            val raio = readLine()?.toDouble() ?: return
            println("Área da Circunferência: ${calcularAreaCircunferencia(raio)}")
        }
        7 -> {
            println("Informe a diagonal maior do losango:")
            val diagonalMaior = readLine()?.toDouble() ?: return
            println("Informe a diagonal menor do losango:")
            val diagonalMenor = readLine()?.toDouble() ?: return
            println("Área do Losango: ${calcularAreaLosango(diagonalMaior, diagonalMenor)}")
        }
        8 -> {
            println("Informe a base maior do trapézio:")
            val baseMaior = readLine()?.toDouble() ?: return
            println("Informe a base menor do trapézio:")
            val baseMenor = readLine()?.toDouble() ?: return
            println("Informe a altura do trapézio:")
            val altura = readLine()?.toDouble() ?: return
            println("Área do Trapézio: ${calcularAreaTrapezio(baseMaior, baseMenor, altura)}")
        }
        else -> println("Opção inválida!")
    }
}
