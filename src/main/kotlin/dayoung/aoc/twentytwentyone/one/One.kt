package dayoung.aoc.twentytwentyone.one

class One {
  private val input = this::class.java.getResource("/one.txt")!!.readText().split("\n").map(String::toInt)
  private fun part1(): Int =
    input.windowed(2).count { (first: Int, second: Int) -> second > first }

  private fun part2(): Int =
    input.windowed(3).map { it.sum() }.windowed(2).count { (first: Int, second: Int) -> second > first }

  fun solve(): Pair<Int, Int> =
    Pair(part1(), part2())
}