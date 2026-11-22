fun main() {
    val notas = Array(3) { DoubleArray(2) }

    notas[0][0] = 8.0
    notas[0][1] = 7.0

    notas[1][0] = 6.0
    notas[1][1] = 5.0

    notas[2][0] = 9.0
    notas[2][1] = 10.0

    var somaTurma = 0.0

    for (aluno in notas.indices) {
        val media = (notas[aluno][0] + notas[aluno][1]) / 2

        println("Aluno ${aluno + 1}: Média = $media")

        if (media >= 7.0) {
            println("Situação: Aprovado")
        } else {
            println("Situação: Reprovado")
        }

        somaTurma += media
    }

    val mediaTurma = somaTurma / notas.size

    println("Média geral da turma: $mediaTurma")
}