fun main() {

    fun findFraquezas (tipo: String): Any {
        return when (tipo) {
            "GRAMA" -> listOf("FOGO", "VÍRUS", "GELADO")
            "VENENO" -> listOf("TERRA", "PSIQUICO")
            else -> emptyList()
        }
    }

    val bulbasaur = mapOf(
        "GRAMA" to findFraquezas("GRAMA"),
        "VENENO" to findFraquezas(("VENENO"))
    )

    val ivysaur = mapOf(
        "GRAMA" to findFraquezas("GRAMA"),
        "VENENO" to findFraquezas(("VENENO"))
    )

}