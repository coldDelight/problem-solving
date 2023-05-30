fun main() {
    val t = readln().toInt()
    repeat(t) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        var mon = 0
        when (a) {
            1 -> mon = 5_000_000
            in 2..3 -> mon = 3_000_000
            in 4..6 -> mon = 2_000_000
            in 7..10 -> mon = 500_000
            in 11..15 -> mon = 300_000
            in 16..21 -> mon = 100_000
        }

        when (b) {
            1 -> mon += 5_120_000
            in 2..3 -> mon += 2_560_000
            in 4..7 -> mon += 1_280_000
            in 8..15 -> mon += 640_000
            in 16..31 -> mon += 320_000
        }
        println(mon)
    }
}