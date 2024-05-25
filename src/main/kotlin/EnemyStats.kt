object EnemyStats {

    data class Stats(
        val health: Int,
        val damage: Int,
        val dropCount: Int,
        val dropPool: ItemPools.Pool,
        val xp: Int
    )

    val goblin = Stats(
        listOf(20,25,30).random(),
        5,
        listOf(1,2,3).random(),
        ItemPools.Pool.Simple,
        (5..10).random()
    )

    val trenton = Stats(
        listOf(5,10,15).random(),
        2,
        1,
        ItemPools.Pool.Simple,
        (1..5).random()
    )
}