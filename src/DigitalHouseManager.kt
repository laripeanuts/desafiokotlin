data class DigitalHouseManager {

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
        val curso = buscarCurso(codigoCurso)
        listaCurso.remove(curso)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String,
                                  codigoProfessor: Int, quantidadeDeHoras: Int) {
        val professorAdjunto = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras)

        listaProfessores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String ,
                                  codigoProfessor: Int, especialidade: String ){
        val professorTitular = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        val professor = buscarProfessor(codigoProfessor)
        listaProfessores.remove(professor)

    }

    fun registrarAluno(nome: String , sobrenome: String , codigoAluno: Int){
        val aluno = Aluno(nome, sobrenome, codigoAluno )
        listaAlunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int,  codigoCurso: Int){
        val aluno = buscarAluno(codigoAluno)
        val curso = buscarCurso(codigoCurso)

        var adicionou = false
        if (curso != null
                && aluno != null){
            adicionou = curso.adicionarUmAluno(aluno)
        }
        if (adicionou){
            val matricula = Matricula(aluno!!, curso!!)
            listaMatriculas.add(matricula)
            println("Matrícula realizada!")
        } else {
            println("Não foi possível realizar a matrícula, pois não há vagas")
        }
    }

    private fun buscarCurso(codigoCurso: Int): Curso? {
        listaCurso.forEach {
            it.codigoCurso = codigoCurso
            return it
        }
        return null
    }
    private fun buscarProfessor(codigoProfessor: Int): Professor? {
        listaProfessores.forEach {
            it.codigoProfessor = codigoProfessor
            return it
        }
        return null
    }

    private fun buscarAluno(codigoAluno: Int): Aluno? {
        listaAlunos.forEach {
            it.codigoAluno = codigoAluno
            return it
        }
        return null
    }
}
