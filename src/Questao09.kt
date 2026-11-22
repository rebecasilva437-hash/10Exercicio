fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 0, 2),
        intArrayOf(-3, 4, 0),
        intArrayOf(5, -1, 6)
    )

    var soma = 0

    for (linha in matriz) {
        for (valor in linha) {

            if (valor == 0) {
                continue
            }

            if (valor > 0) {
                soma += valor
            }
        }
    }

    println("Soma dos valores positivos: $soma")
}