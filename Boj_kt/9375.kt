fun main() {
    val br = System.`in`.bufferedReader()
    val t = br.readLine().toInt()

    repeat(t) {
        val n = br.readLine().toInt()
        val map = HashMap<String, Int>()

        var res = 1
        repeat(n) {
            val clothes = br.readLine().split(" ")
            val tmp = map[clothes[1]] ?: 0
            map[clothes[1]] = tmp + 1
        }
        map.forEach {
            res *= it.value + 1
        }
        println(res - 1)
    }
    br.close()
}