fun main() {
    val expression = readln().split("-")
    val num = mutableListOf<Int>()
    for (i in expression) {
        var tmp = 0
        val tmpPlus = i.split("+")
        for (j in tmpPlus) {
            tmp += j.toInt()
        }
        num.add(tmp)
    }
    var res = num[0]
    for (i in 1 until num.size) {
        res -= num[i]
    }
    print(res)
}
