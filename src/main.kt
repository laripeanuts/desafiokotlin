fun main() {

    val digitalHouseManager = DigitalHouseManager()

    digitalHouseManager.registrarAluno("Larissa", "Rabeloo", 1)
    digitalHouseManager.registrarCurso("computacao" ,1, 5)

    digitalHouseManager.matricularAluno(1, 1)

    digitalHouseManager.registrarAluno("larissa2", "larissa2", 2)
    digitalHouseManager.registrarAluno("larissa2", "larissa2", 2)
    digitalHouseManager.registrarAluno("larissa3", "larissa3", 3)
    digitalHouseManager.registrarAluno("larissa4", "larissa4", 4)
    digitalHouseManager.registrarAluno("larissa5", "larissa5", 5)
    digitalHouseManager.registrarAluno("larissa6", "larissa6", 6)

    digitalHouseManager.matricularAluno(2, 1)
    digitalHouseManager.matricularAluno(3, 1)
    digitalHouseManager.matricularAluno(4, 1)
    digitalHouseManager.matricularAluno(5, 1)
    digitalHouseManager.matricularAluno(6, 1)
}