object ItemStats {
    class Stats(
        val name: String,
        val effect: Effect,
        val strength: Int,
        val value: Int
    ) {

    }
    enum class Effect {
        Heal, Nothing
    }
    val coins = Stats("Gold Coins", Effect.Nothing, 0, 10)

    val healCrysS = Stats("Simple Health Crystal", Effect.Heal,10,5)
    val healCrysT = Stats("Tough Health Crystal", Effect.Heal, 20, 10)
    val healCrysH = Stats("Heroic Health Crystal", Effect.Heal, 40, 30)
    val healCrysU = Stats("Unmatched Health Crystal", Effect.Heal, 80, 60)

}