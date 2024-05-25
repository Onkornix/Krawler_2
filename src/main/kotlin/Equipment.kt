import stats.EquipmentStats
object Equipment {

    enum class Equipment(val stats: EquipmentStats.Stats) {
        Sword(EquipmentStats.sword)
    }
}