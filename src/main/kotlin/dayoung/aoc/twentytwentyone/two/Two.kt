package dayoung.aoc.twentytwentyone.two

fun List<String>.toInstruction(): List<Pair<String, Int>> {
    return this.map {
        Pair(it.substringBefore(" "), it.substringAfter(" ").toInt())
    }
}

class Two {
    private val input = this::class.java.getResourceAsStream("/two.txt")!!.bufferedReader().readLines().toInstruction()
    private fun part1(): Int {
        var pos = Pair(0,0)
        for(direction in input) {
            pos = when(direction.first) {
                "forward" -> Pair(pos.first + direction.second, pos.second)
                "up", -> Pair(pos.first, pos.second - direction.second)
                "down" -> Pair(pos.first, pos.second + direction.second)
                else -> pos
            }
        }
        return pos.first * pos.second
    }

    private fun part2(): Int {
        var pos = Pair(0, 0)
        var aim = 0
        for(direction in input) {
            when(direction.first) {
                "forward" -> pos = Pair(pos.first + direction.second, pos.second + (aim * direction.second))
                "up" -> aim -= direction.second
                "down" -> aim += direction.second
            }
        }
        return pos.first * pos.second
    }

    fun solve(): Pair<Int, Int> =
        Pair(part1(), part2())
}