
class Enemy {
    enum class Enemies(val stats: EnemyStats.Stats) {
        Goblin(EnemyStats.goblin), Trenton(EnemyStats.trenton)
    }

    var health: Int
    val damage: Int
    val dropCount: Int
    private val dropPool: ItemPools.Pool
    private val xp: Int

    val type: Enemies

    init {
        type = chooseEnemy()
        val stats = type.stats

        health = stats.health
        damage = stats.damage
        dropCount = stats.dropCount
        dropPool = stats.dropPool
        xp = stats.xp

    }

    private fun chooseEnemy(): Enemies {
        return Enemies.Goblin
    }
    fun loot(): List<ItemPools.Item> {
        val loot = mutableListOf<ItemPools.Item>()
        loot.run {
            for (i in (0..<dropCount)) {
                this.add(dropPool.rarity.random())
            }
        }
        return loot
    }
}