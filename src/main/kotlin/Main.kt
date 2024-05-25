import stats.EquipmentStats
import kotlin.random.Random


var health = 100
var damage = 100
var level = 0
val inventory = mutableMapOf<Items.Item, Int>()
val equipment = mutableMapOf<EquipmentStats.Slot,Equipment.Equipment>()
fun main() {


    var game = true
    var shopCounter = Random.nextInt(from = 5, until = 10)
    while (game) {
        val enemy = newEnemy()
        val enounter = fight(enemy)

        if (enounter) {
            lootEnemy(enemy)
        }

        if (health <= 0) {
            game = false
        }
        if (shopCounter == 0) {
            TODO()
            // shopCounter = Random.nextInt(until = 10)
        } else {
            shopCounter--
        }
    }
}

fun lootEnemy(enemy: Enemy) {

    for (item in enemy.loot()) {
        if (inventory[item] == null) {
            inventory[item] = 1
        } else {
            inventory[item] = inventory[item]!!.inc()
        }
    }

}

fun fight(enemy: Enemy): Boolean {
    while (enemy.health > 0 && health > 0) {

        print("your move: [ (a) Attack, (f) Flee, (i) Inventory, (e) Equipment, (s) stats, ]\n> ")
        val response = readln()
            .trim()
            .lowercase()
            .filter { listOf('a','f','i','e','s').contains(it) }
            .run { while (this.length > 1) { this.dropLast(1) }; this}

        when (response) {
            "a" -> attack(enemy)
            "i" -> {
                openInventory()
                continue
            }
            "f" -> {
                if (attemptFlee(enemy)) {
                    break
                }
            }
            "s" -> {
                printStats()
                continue
            }
        }

        println("health remaining: ${enemy.health}")

        println("The ${enemy.type} hits you for ${enemy.damage}\n")
    }
    return health > 0
}

fun attack(enemy: Enemy) {

    enemy.health -= damage

}

fun openInventory() {
    for (item in inventory.keys) {
        println("${item.stats.name}: ${inventory[item]}")
    }



}

fun attemptFlee(enemy: Enemy): Boolean {
    TODO()
}

fun printStats() {
    TODO()
}

fun newEnemy(): Enemy {
    val enemy = Enemy()
    println("encountering enemy!\n\n${enemy.type}: [ health: ${enemy.health}, damage: ${enemy.damage} ]")
    return enemy
}