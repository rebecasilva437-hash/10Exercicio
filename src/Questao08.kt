fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )

    var soma = 0

    println("Matriz:")

    for (linha in matriz.indices) {
        for (coluna in matriz[linha].indices) {
            print("${matriz[linha][coluna]} ")

            if (linha == coluna) {
                soma += matriz[linha][coluna]
            }
        }
        println()
    }

    println("Soma da diagonal principal: $soma")
}