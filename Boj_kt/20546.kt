
fun main() {
    val seedMoney = readln().toInt()
    val chart = readln().split(" ").map { it.toInt() }

    val bnpRes = bnp(seedMoney,chart)
    val ttRes = tt(seedMoney,chart)
    if (bnpRes<ttRes){
        print("TIMING")
    }else if (bnpRes==ttRes){
        print("SAMESAME")
    }else{
        print("BNP")
    }
}

fun bnp(seedMoney: Int, chart: List<Int>): Int {
    var current = seedMoney
    var stock = 0
    chart.forEach {
        stock += current / it
        current %= it
    }
    return current + (stock * chart[13])
}

fun tt(seedMoney: Int, chart: List<Int>): Int {
    var current = seedMoney
    var stock = 0
    chart.forEachIndexed { index, value ->
        when (index) {
            in 2..12 -> {
                if (chart[index - 2] < chart[index - 1] && chart[index - 1] < value) {
                    current += stock * chart[index + 1]
                    stock = 0
                }
                if (chart[index - 2] > chart[index - 1] && chart[index - 1] > value) {
                    stock += current / chart[index + 1]
                    current %= chart[index + 1]
                }
            }
            13 -> {
                current += stock * value
                stock = 0
            }
        }
    }
    return current
}