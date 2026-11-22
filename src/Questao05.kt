fun main() {
    val tarefas = arrayOf(
        "Estudar Kotlin",
        "Fazer atividade",
        "Revisar conteúdo",
        "Enviar trabalho"
    )

    for ((indice, tarefa) in tarefas.withIndex()) {
        println("Tarefa ${indice + 1}: $tarefa")
    }
}