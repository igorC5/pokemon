fun main() {

    fun findFraquezas (tipo: String): Any {
        return when (tipo) {
            "FAIRY" -> listOf("POISON", "STEEL")
            "STEEL" -> listOf("FIRE", "FIGHT", "GROUND")
            "DARK" -> listOf("FIGHT", "BUG", "FAIRY")
            "DRAGON" -> listOf("ICE", "DRAGON", "FAIRY")
            "GHOST" -> listOf("GHOST", "DARK")
            "ROCK" -> listOf("WATER", "GRASS", "FIGHT", "GROUND", "STEEL")
            "BUG" -> listOf("FIRE", "FLYING", "ROCK")
            "PSYCHC" -> listOf("BUG", "GHOST", "DARK")
            "FLYING" -> listOf("ELECTR", "ICE", "ROCK")
            "GROUND" -> listOf("WATER", "GRASS", "ICE")
            "POISON" -> listOf("GROUND", "PSYCHC")
            "FIGHT" -> listOf("FLYING", "PSYCHC", "FAIRY")
            "ICE" -> listOf("FIRE", "FIGHT", "ROCK", "STEEL")
            "GRASS" -> listOf("FIRE", "ICE", "POISON", "FLYING", "BUG")
            "ELECTR" -> listOf("GROUND")
            "WATER" -> listOf("ELECTR", "GRASS")
            "FIRE" -> listOf("WATER", "GROUND", "ROCK")
            "NORMAL" -> listOf("FIGHT")
            else -> emptyList()
        }
    }

    val bulbasaur = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "POISON" to findFraquezas(("POISON"))
    )

    val ivysaur = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "POISON" to findFraquezas(("POISON"))
    )

    val venusaur = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "POISON" to findFraquezas("POISON")
    )

    val charmander = mapOf(
        "FIRE" to findFraquezas("FIRE")
    )

    val charmeleon = mapOf(
        "FIRE" to findFraquezas("FIRE"),
    )

    val charizard = mapOf(
        "FIRE" to findFraquezas("FIRE"),
        "FLYING" to findFraquezas("FLYING")
    )

    val squirtle = mapOf(
        "WATER" to findFraquezas("WATER"),
    )

    val wartortle = mapOf(
        "WATER" to findFraquezas("WATER"),
    )

    val blastoise = mapOf(
        "WATER" to findFraquezas("WATER"),
    )

    val caterpie = mapOf(
        "BUG" to findFraquezas("BUG"),
    )

    val metapod = mapOf(
        "BUG" to findFraquezas("BUG"),
    )

    val butterfree = mapOf(
        "BUG" to findFraquezas("BUG"),
        "FLYING" to findFraquezas("FLYING")
    )

    val weedle = mapOf(
        "BUG" to findFraquezas("BUG"),
        "POISON" to findFraquezas("POISON")
    )

    val kakuna = mapOf(
        "BUG" to findFraquezas("BUG"),
        "POISON" to findFraquezas("POISON")
    )

    val beedrill = mapOf(
        "BUG" to findFraquezas("BUG"),
        "POISON" to findFraquezas("POISON")
    )

    val pidgey = mapOf(
        "NORMAL" to findFraquezas("NORMAL"),
        "FLYING" to findFraquezas("FLYING"),
    )

    val pidgeotto = mapOf(
        "NORMAL" to findFraquezas("NORMAL"),
        "FLYING" to findFraquezas("FLYING"),
    )

    val pidgeot = mapOf(
        "NORMAL" to findFraquezas("NORMAL"),
        "FLYING" to findFraquezas("FLYING"),
    )

    val rattata = mapOf(
        "NORMAL" to findFraquezas("NORMAL"),
    )

    val raticate = mapOf(
        "NORMAL" to findFraquezas("NORMAL"),
    )

    val spearow = mapOf(
        "NORMAL" to findFraquezas("NORMAL"),
        "FLYING" to findFraquezas("FLYING"),
    )

    val fearow = mapOf(
        "NORMAL" to findFraquezas("NORMAL"),
        "FLYING" to findFraquezas("FLYING"),
    )

    val ekans = mapOf(
        "POISON" to findFraquezas("POISON"),
    )

    val arbok = mapOf(
        "POISON" to findFraquezas("POISON"),
    )

    val pikachu = mapOf(
        "ELECTR" to findFraquezas("ELECTR"),
    )

    val raichu = mapOf(
        "ELECTR" to findFraquezas("ELECTR"),
    )

    val sandshrew = mapOf(
        "GROUND" to findFraquezas("GROUND"),
    )

    val sandslash = mapOf(
        "POISON" to findFraquezas("POISON"),
    )

    val nidoranM = mapOf(
        "POISON" to findFraquezas("POISON"),
    )

    val nidorina = mapOf(
        "POISON" to findFraquezas("POISON"),
    )

    val nidoqueen = mapOf(
        "POISON" to findFraquezas("POISON"),
        "GROUND" to findFraquezas("GROUND"),
    )

    val nidoranF = mapOf(
        "POISON" to findFraquezas("POISON"),
    )

    val nidorino = mapOf(
        "POISON" to findFraquezas("POISON"),
    )

    val nidoking = mapOf(
        "POISON" to findFraquezas("POISON"),
        "GROUND" to findFraquezas("GROUND"),
    )

    val clefairy = mapOf(
        "FAIRY" to findFraquezas("FAIRY")
    )

    val clefable = mapOf(
        "FAIRY" to findFraquezas("FAIRY")
    )

    val vulpix = mapOf(
        "FIRE" to findFraquezas("FIRE"),
    )

    val ninetales = mapOf(
        "FIRE" to findFraquezas("FIRE"),
    )

    val jigglypuff = mapOf(
        "FAIRY" to findFraquezas("FAIRY"),
        "NORMAL" to findFraquezas("NORMAL")
    )

    val wigglytuff = mapOf(
        "FAIRY" to findFraquezas("FAIRY"),
        "NORMAL" to findFraquezas("NORMAL")
    )

    val zubat = mapOf(
        "POISON" to findFraquezas("POISON"),
        "FLYING" to findFraquezas("FLYING")
    )

    val golbat = mapOf(
        "POISON" to findFraquezas("POISON"),
        "FLYING" to findFraquezas("FLYING")
    )

    val oddish = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "POISON" to findFraquezas("POISON"),
    )

    val gloom = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "POISON" to findFraquezas("POISON"),
    )

    val vileplume = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "POISON" to findFraquezas("POISON"),
    )

    val paras = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "BUG" to findFraquezas("BUG"),
    )

    val parasect = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "BUG" to findFraquezas("BUG"),
    )

    val venonat = mapOf(
        "POISON" to findFraquezas("POISON"),
        "BUG" to findFraquezas("BUG"),
    )

    val venomoth = mapOf(
        "POISON" to findFraquezas("POISON"),
        "BUG" to findFraquezas("BUG"),
    )

    val diglett = mapOf(
        "GROUND" to findFraquezas("GROUND"),
    )

    val dugtrio = mapOf(
        "GROUND" to findFraquezas("GROUND"),
    )

    val meowth = mapOf(
        "" to findFraquezas();
    )

    val persian = mapOf(
        "" to findFraquezas();
    )

    val psyduck = mapOf(
        "" to findFraquezas();
    )

    val golduck = mapOf(
        "" to findFraquezas();
    )

    val mankey = mapOf(
        "" to findFraquezas();
    )

    val primeape = mapOf(
        "" to findFraquezas();
    )

    val growlithe = mapOf(
        "" to findFraquezas();
    )

    val arcanine = mapOf(
        "" to findFraquezas();
    )

    val poliwag = mapOf(
        "" to findFraquezas();
    )

    val poliwrath = mapOf(
        "" to findFraquezas();
    )

    val abra = mapOf(
        "" to findFraquezas();
    )

    val kadabra = mapOf(
        "" to findFraquezas();
    )

    val alakazam = mapOf(
        "" to findFraquezas();
    )

    val machop = mapOf(
        "" to findFraquezas();
    )

    val machoke = mapOf(
        "" to findFraquezas();
    )

    val machamp = mapOf(
        "" to findFraquezas();
    )

    val bellsprout = mapOf(
        "" to findFraquezas();
    )

    val weepinbell = mapOf(
        "" to findFraquezas();
    )

    val victreebel = mapOf(
        "" to findFraquezas();
    )

    val tentacool = mapOf(
        "" to findFraquezas();
    )

    val tentacruel = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "POISON" to findFraquezas(("POISON"))
    )

    val geodude = mapOf(
        "GRASS" to findFraquezas("GRASS"),
        "POISON" to findFraquezas(("POISON"))
    )

    val graveler = mapOf(
        "" to findFraquezas();
    )

    val golem = mapOf(
        "" to findFraquezas();
    )

    val ponyta = mapOf(
        "" to findFraquezas();
    )

    val rapidash = mapOf(
        "" to findFraquezas();
    )

    val slowpoke = mapOf(
        "" to findFraquezas();
    )

    val slowbro = mapOf(
        "" to findFraquezas();
    )

    val magnemite = mapOf(
        "" to findFraquezas();
    )

    val magneton = mapOf(
        "" to findFraquezas();
    )

    val farfetchd = mapOf(
        "" to findFraquezas();
    )

    val doduo = mapOf(
        "" to findFraquezas();
    )

    val dodrio = mapOf(
        "" to findFraquezas();
    )

    val seel = mapOf(
        "" to findFraquezas();
    )

    val dewgong = mapOf(
        "" to findFraquezas();
    )

    val grimer = mapOf(
        "" to findFraquezas();
    )

    val shellder = mapOf(
        "" to findFraquezas();
    )

    val cloyster = mapOf(
        "" to findFraquezas();
    )

    val gastly = mapOf(
        "" to findFraquezas();
    )

    val haunter = mapOf(
        "" to findFraquezas();
    )

    val gengar = mapOf(
        "" to findFraquezas();
    )

    val onix = mapOf(
        "" to findFraquezas();
    )

    val drowzee = mapOf(
        "" to findFraquezas();
    )

    val hypno = mapOf(
        "" to findFraquezas();
    )

    val krabby = mapOf(
        "" to findFraquezas();
    )

    val kingler = mapOf(
        "" to findFraquezas();
    )

    val voltorb = mapOf(
        "" to findFraquezas();
    )

    val electrode = mapOf(
        "" to findFraquezas();
    )

    val exeggcute = mapOf(
        "" to findFraquezas();
    )

    val exeggutor = mapOf(
        "" to findFraquezas();
    )

    val cubone = mapOf(
        "" to findFraquezas();
    )

    val marowak = mapOf(
        "" to findFraquezas();
    )

    val hitmonlee = mapOf(
        "" to findFraquezas();
    )

    val hitmonchan = mapOf(
        "" to findFraquezas();
    )

    val lickitung = mapOf(
        "" to findFraquezas();
    )

    val koffing = mapOf(
        "" to findFraquezas();
    )

    val weezing = mapOf(
        "" to findFraquezas();
    )

    val rhyhorn = mapOf(
        "" to findFraquezas();
    )

    val rhydon = mapOf(
        "" to findFraquezas();
    )

    val rhydon = mapOf(
        "" to findFraquezas();
    )

    val chansey = mapOf(
        "" to findFraquezas();
    )

    val tangela = mapOf(
        "" to findFraquezas();
    )

    val kangaskhan = mapOf(
        "" to findFraquezas();
    )

    val horsea = mapOf(
        "" to findFraquezas();
    )

    val seadra = mapOf(
        "" to findFraquezas();
    )

    val goldeen = mapOf(
        "" to findFraquezas();
    )

    val seaking = mapOf(
        "" to findFraquezas();
    )

    val staryu = mapOf(
        "" to findFraquezas();
    )

    val starmie = mapOf(
        "" to findFraquezas();
    )

    val mr_mime = mapOf(
        "" to findFraquezas();
    )

    val scyther = mapOf(
        "" to findFraquezas();
    )

    val jynx = mapOf(
        "" to findFraquezas();
    )

    val electabuzz = mapOf(
        "" to findFraquezas();
    )

    val magmar = mapOf(
        "" to findFraquezas();
    )

    val pinsir = mapOf(
        "" to findFraquezas();
    )

    val taurus = mapOf(
        "" to findFraquezas();
    )

    val magikarp = mapOf(
        "" to findFraquezas();
    )

    val gyarados = mapOf(
        "" to findFraquezas();
    )

    val lapras = mapOf(
        "" to findFraquezas();
    )

    val ditto = mapOf(
        "" to findFraquezas();
    )

    val eevee = mapOf(
        "" to findFraquezas();
    )

    val vaporeon = mapOf(
        "" to findFraquezas();
    )

    val jolteon = mapOf(
        "" to findFraquezas();
    )

    val flareon = mapOf(
        "" to findFraquezas();
    )

    val porygon = mapOf(
        "" to findFraquezas();
    )

    val omanyte = mapOf(
        "" to findFraquezas();
    )

    val omastar = mapOf(
        "" to findFraquezas();
    )

    val kabuto = mapOf(
        "" to findFraquezas();
    )

    val kabutops = mapOf(
        "" to findFraquezas();
    )

    val aerodactyl = mapOf(
        "" to findFraquezas();
    )

    val snorlax = mapOf(
        "" to findFraquezas();
    )

    val articuno = mapOf(
        "" to findFraquezas();
    )

    val zapdos = mapOf(
        "" to findFraquezas();
    )

    val moltres = mapOf(
        "" to findFraquezas();
    )

    val dratini = mapOf(
        "" to findFraquezas();
    )

    val dragonair = mapOf(
        "" to findFraquezas();
    )

    val dragonite = mapOf(
        "" to findFraquezas();
    )

    val mewtwo = mapOf(
        "" to findFraquezas();
    )

    val mew = mapOf(
        "PSYCHC" to findFraquezas();
    )

    print(bulbasaur)
}