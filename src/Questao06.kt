fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12)
    )

    for (linha in matriz.indices) {
        var soma = 0

        for (coluna in matriz[linha].indices) {
            soma += matriz[linha][coluna]
        }

        println("Soma da linha ${linha + 1}: $soma")
    }
}