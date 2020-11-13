data class Curso(
        val nomeDoCurso: String,
        var codigoCurso: Int,
        val quantidadeMaxAluno: Int
) {
    val professorTitular: ProfessorTitular? = null
    val professorAdjunto: ProfessorAdjunto? = null
    val listaAlunosMatriculados = arrayListOf<Aluno>()

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if(listaAlunosMatriculados.size <= quantidadeMaxAluno){
            listaAlunosMatriculados.add(umAluno)
            true
        } else {
            false
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        listaAlunosMatriculados.remove(umAluno)
    }
}