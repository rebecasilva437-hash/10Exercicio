fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )

    val transposta = Array(3) { IntArray(2) }

    for (linha in matriz.indices) {
        for (coluna in matriz[linha].indices) {
            transposta[coluna][linha] = matriz[linha][coluna]
        }
    }

    println("Matriz original:")
    for (linha in matriz) {
        println(linha.contentToString())
    }

    println("Matriz transposta:")
    for (linha in transposta) {
        println(linha.contentToString())
    }
}