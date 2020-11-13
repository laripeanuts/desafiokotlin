data class ProfessorAdjunto(nome: String, sobrenome: String, tempoDeCasa: Int, codigoProfessor: Int, val horasMonitoria: Int): Professor(nome, sobrenome, tempoDeCasa, codigoProfessor) {
}