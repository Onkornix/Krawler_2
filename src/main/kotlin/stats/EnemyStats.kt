package stats

import Items

object EnemyStats {

    data class Stats(
        val health: Int,
        val damage: Int,
        val dropCount: Int,
        val dropPool: Items.Pool,
        val xp: Int
    )

    val goblin = Stats(
        listOf(20,25,30).random(),
        5,
        listOf(1,2,3).random(),
        Items.Pool.Simple,
        (5..10).random()
    )

    val trenton = Stats(
        listOf(5,10,15).random(),
        2,
        1,
        Items.Pool.Simple,
        (1..5).random()
    )
}