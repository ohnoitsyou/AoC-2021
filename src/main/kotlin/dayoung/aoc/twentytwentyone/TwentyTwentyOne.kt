package dayoung.aoc.twentytwentyone

import dayoung.aoc.twentytwentyone.one.One

fun main() {
    TwentyTwentyOne.solve()
}

class TwentyTwentyOne {
    companion object {
        fun solve() {
            val (d1p1, d1p2) = One().solve()
            println("Day 1:\n\tPart 1: $d1p1\n\tPart 2: $d1p2")
            /*
            val (d2p1, d2p2) = Two().solve()
            println("Day 2:\n\tPart 1: $d1p1\n\tPart 2: $d1p2")
            val (d3p1, d3p2) = Two().solve()
            println("Day 3:\n\tPart 1: $d1p1\n\tPart 2: $d1p2")
            val (d4p1, d4p2) = Two().solve()
            println("Day 4:\n\tPart 1: $d1p1\n\tPart 2: $d1p2")
            val (d5p1, d5p2) = Two().solve()
            println("Day 5:\n\tPart 1: $d1p1\n\tPart 2: $d1p2")
             */
        }
    }
}
