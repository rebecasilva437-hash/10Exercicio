fun main() {
    val numeros = intArrayOf(10, 20, 30, 40, 50, 60)

    var inicio = 0
    var fim = numeros.size - 1

    while (inicio < fim) {
        val temp = numeros[inicio]
        numeros[inicio] = numeros[fim]
        numeros[fim] = temp

        inicio++
        fim--
    }

    println("Vetor invertido:")
    println(numeros.contentToString())
}