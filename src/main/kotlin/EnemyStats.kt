object EnemyStats {


    enum class Pools {
        Common
    }

    object Goblin {
        val health = listOf(20,25,30).random()
        val damage = 5
        val drops = listOf(1,2,3).random()
        val dropPool = Pools.Common
        val xp = (5..10).random()
    }
}