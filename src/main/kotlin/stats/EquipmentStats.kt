package stats

object EquipmentStats {

    enum class Effect {
        Health, Defense, Nothing
    }
    enum class Slot {
        Head, Torso, Hands, Legs, Feet, MainHand, OffHand
    }
    data class Stats(
        val name: String,
        val description: String,

        val bonusEffect: Effect,
        val bonusEffectStrength: Int,

        val equipSlot: Slot,

        val defense: Int,
        val weight: Int,
        val damage: Int,
        )

    val sword = Stats(
        "Sword",
        "Just a Sword",
         Effect.Nothing,
        0,
         Slot.MainHand,
        0,
        3,
        5
    )
}