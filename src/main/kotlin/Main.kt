//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val player = Player(
        name = "dylan"
    )

    while (player.health > 0) {

        val enemy = newEnemy()

        while (enemy.health > 0) {
            print("your move: [ (a) Attack, (i) Inventory, (f) Flee, (s) stats]\n> ")
            val response = readln()

            when (response) {
                "a" -> attack(player,enemy)
                "i" -> {
                    openInventory(player)
                    continue
                }
                "f" -> {
                    if (attemptFlee(enemy)) {
                        break
                    }
                }
                "s" -> {
                    printStats(player)
                    continue
                }
            }

            println("health remaining: ${enemy.health}")

            println("The ${enemy.type} hits you for ${enemy.damage}\n")
        }
    }
}
fun attack(player: Player, enemy: Enemy) {

    enemy.health -= player.damage

}

fun openInventory(player: Player) {

}

fun attemptFlee(enemy: Enemy): Boolean {
    return true
}

fun printStats(player: Player) {
    println()
}

fun newEnemy(): Enemy {
    val enemy = Enemy()
    println("encountering enemy!\n\n${enemy.type}: [ health: ${enemy.health}, damage: ${enemy.damage} ]")
    return enemy
}