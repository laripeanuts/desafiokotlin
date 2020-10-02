class DigitalHouseManager {

    val listaAlunos = arrayListOf<Aluno>()
    val listaProfessores = arrayListOf<Professor>()
    val listaCurso = arrayListOf<Curso>()
    val listaMatriculas = arrayListOf<Matricula>()

    fun registrarCurso(nome: String, codigo: Int,
                       quantidadeMaximaDeAlunos: Int) {
        val curso = Curso(nome, codigo, quantidadeMaximaDeAlunos)
        listaCurso.add(curso)
    }

    fun excluirCurso(codigoCurso: Int) {
        for(codigoCurso, listaCurso.leng)
        listaCurso.remove
    }
}
