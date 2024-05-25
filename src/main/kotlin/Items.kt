import stats.ItemStats

object Items {

    enum class Pool(val pool: List<Item>) {
        Simple(simple), Tough(tough), Heroic(heroic), Unmatched(unmatched)
    }
    enum class Item(val stats: ItemStats.Stats) {
        // Simple
        Coins(ItemStats.coins), HealCrysS(ItemStats.healCrysS),

        // Tough
        HealCrysT(ItemStats.healCrysT),

        // Heroic
        HealCrysH(ItemStats.healCrysH),

        // Unmatched
        HealCrysU(ItemStats.healCrysU)
    }

    val simple = listOf(
        Item.Coins, Item.HealCrysS
    )

    val tough = listOf(
        Item.HealCrysT
    )

    val heroic = listOf(
        Item.HealCrysH
    )

    val unmatched = listOf(
        Item.HealCrysU
    )
}