fun main() {
    val codigos = arrayOf("A101", "B202", "C303", "D404", "E505")

    val codigoBusca = "C303"

    for (i in codigos.indices) {
        if (codigos[i] == codigoBusca) {
            println("Código encontrado na posição: $i")
            break
        }
    }
}