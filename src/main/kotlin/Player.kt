class Player(
    name: String,

){
    var health = 100
    var damage = 5
    val inventory = mutableMapOf<String,Int>()
}