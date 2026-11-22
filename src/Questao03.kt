fun main() {
    val temperaturas = doubleArrayOf(
        28.0, 30.0, 32.0, 29.0, 35.0, 31.0, 27.0
    )

    var soma = 0.0

    for (temp in temperaturas) {
        soma += temp
    }

    val media = soma / temperaturas.size

    println("Média da semana: $media")

    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("Dia ${i + 1}: ${temperaturas[i]} graus")
        }
    }
}