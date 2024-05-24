
class Enemy {
    enum class Enemies {
        Goblin, /*Trenton*/
    }

    private val statsMap = mutableMapOf(
        Enemies.Goblin to EnemyStats.Goblin,
        //Enemies.Trenton to EnemyStats.Trenton
    )

    var health: Int
    val damage: Int
    private val drops: Int
    private val dropPool: EnemyStats.Pools
    private val xp: Int

    val type: Enemies

    init {
        type = rollEnemyType()
        val stats = statsMap[type]!!

        health = stats.health
        damage = stats.damage
        drops = stats.drops
        dropPool = stats.dropPool
        xp = stats.xp

    }

    private fun rollEnemyType(): Enemies {
        return Enemies.Goblin
    }
}