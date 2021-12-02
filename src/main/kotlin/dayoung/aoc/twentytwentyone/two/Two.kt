package dayoung.aoc.twentytwentyone.two

data class Submarine(val x: Int, val y: Int, val dy: Int) {
    fun value() = this.x * this.y
}
data class Instruction(val dir: String, val value: Int)

fun List<String>.toInstruction(): List<Instruction> {
    return this.map {
        Instruction(it.substringBefore(" "), it.substringAfter(" ").toInt())
    }
}

class Two {
    private val input = this::class.java.getResourceAsStream("/two.txt")!!.bufferedReader().readLines().toInstruction()
    private fun part1(): Int =
        input.fold(Submarine(0,0,0)) { sub, direction ->
            when (direction.dir) {
                "forward" -> sub.copy(x = sub.x + direction.value)
                "up", -> sub.copy(y = sub.y - direction.value)
                "down" -> sub.copy(y = sub.y + direction.value)
                else -> sub
            }
        }.value()

    private fun part2(): Int =
        input.fold(Submarine(0,0,0)) { sub, direction ->
            when (direction.dir) {
                "forward" -> sub.copy(x = sub.x + direction.value, y = sub.y + (sub.dy * direction.value))
                "up" -> sub.copy(dy = sub.dy - direction.value)
                "down" -> sub.copy(dy = sub.dy + direction.value)
                else -> sub
            }
        }.value()

    fun solve(): Pair<Int, Int> =
        Pair(part1(), part2())
}