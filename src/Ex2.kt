class Operacoes {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}
fun somar(a: Int, b: Int): Int {
    return a + b
}

fun calcular(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}
fun main(args: Array<String>) {
    println(calcular(2, 3, Operacoes()::somar))
    println(calcular(2, 3, :: somar))
}