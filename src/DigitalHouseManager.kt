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
        val curso = buscaCurso(codigoCurso)
        cursos.remove(curso)
    }

    fun registrarProfessorAdjunto(nome: String, sobrenome: String,
                                  codigoProfessor: Int, quantidadeDeHoras: Int) {
        val professorAdjunto = ProfessorAdjunto(quantidadeDeHoras, nome, sobrenome, codigoProfessor)

        professores.add(professorAdjunto)
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String ,
                                  codigoProfessor: Int, especialidade: String ){
        val professorTitular = ProfessorTitular(especialidade, nome, sobrenome,  codigoProfessor)
    }

    fun excluirProfessor(codigoProfessor: Int) {
        val professro = buscaProfessor(codigoProfessor)
        professores.remove(professro)

    }

    fun registrarAluno(nome: String , sobrenome: String , codigoAluno: Int){
        val aluno = Aluno(nome, sobrenome, codigoAluno )
        alunos.add(aluno)
    }

    fun matricularAluno(codigoAluno: Int,  codigoCurso: Int){
        val aluno = buscarAluno(codigoAluno)
        val curso = buscaCurso(codigoCurso)

        var adicionou = false
        if (curso != null
                && aluno != null){
            adicionou = curso.adicionarUmAluno(aluno)
        }
        if (adicionou){
            val matricula = Matricula(aluno!!, curso!!)
            matriculas.add(matricula)
            println("Matrícula realizada!")
        } else {
            println("Não foi possível realizar a matrícula, pois não há vagas")
        }
    }

    private fun buscaCurso(codigoCurso: Int): Curso? {
        cursos.forEach {
            it.codigoDoCurso = codigoCurso
            return it
        }
        return null
    }
    private fun buscaProfessor(codigoProfessor: Int): Professro? {
        professores.forEach {
            it.codigoDoProfessor = codigoProfessor
            return it
        }
        return null
    }

    private fun buscarAluno(codigoAluno: Int): Aluno? {
        alunos.forEach {
            it.codigoAluno = codigoAluno
            return it
        }
        return null
    }
}
