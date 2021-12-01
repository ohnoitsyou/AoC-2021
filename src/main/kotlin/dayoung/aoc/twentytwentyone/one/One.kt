package dayoung.aoc.twentytwentyone.one

class One {
    private val input = this::class.java.getResourceAsStream("/one.txt").bufferedReader().readLines().map(String::toInt)
    private fun part1(): Int {
        var previous = input[0]
        var count = 0
        for(value in input) {
            if(value > previous) {
                count++
            }
            previous = value
        }
        return count
    }

    private fun part2(): Int {
        var previous = input[0] + input[1] + input[2]
        var count = 0
        for(chunk in input.windowed(3)) {
            if(chunk.sum() > previous) {
                count++
            }
            previous = chunk.sum()
        }

        return count
    }

    fun solve(): Pair<Int, Int> =
        Pair(part1(), part2())
}