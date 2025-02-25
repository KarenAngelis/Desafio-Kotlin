// Classe Conteúdo Educacional
data class ConteudoEducacional(val nome: String, val descricao: String)

// Classe Aluno
data class Aluno(val nome: String, val idade: Int)

// Classe Formação
class Formacao(val nome: String, val nivel: String) {
    private val conteudosEducacionais = mutableListOf<ConteudoEducacional>()
    private val alunosMatriculados = mutableListOf<Aluno>()

    // Método para adicionar conteúdos educacionais
    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudosEducacionais.add(conteudo)
    }

    // Método para matricular alunos
    fun matricularAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
    }

    // Método para exibir a lista de conteúdos educacionais
    fun listarConteudos() {
        println("Conteúdos da formação '$nome':")
        conteudosEducacionais.forEach {
            println("- ${it.nome}: ${it.descricao}")
        }
    }

    // Método para exibir a lista de alunos matriculados
    fun listarAlunos() {
        println("Alunos matriculados na formação '$nome':")
        alunosMatriculados.forEach {
            println("- ${it.nome} (Idade: ${it.idade})")
        }
    }
}

// Função principal para testar a implementação
fun main() {
    // Criando conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", "Conceitos básicos de Kotlin")
    val conteudo2 = ConteudoEducacional("Orientação a Objetos em Kotlin", "Trabalhando com classes e objetos")

    // Criando alunos
    val aluno1 = Aluno("Carlos Silva", 25)
    val aluno2 = Aluno("Ana Oliveira", 30)

    // Criando uma formação e adicionando conteúdos
    val formacao = Formacao("Desenvolvedor Kotlin", "Intermediário")
    formacao.adicionarConteudo(conteudo1)
    formacao.adicionarConteudo(conteudo2)

    // Matriculando alunos
    formacao.matricularAluno(aluno1)
    formacao.matricularAluno(aluno2)

    // Listando conteúdos e alunos
    formacao.listarConteudos()
    formacao.listarAlunos()
}
