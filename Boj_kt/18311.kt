fun main() {
    val br = System.`in`.bufferedReader()
    val tmp = br.readLine().split(" ")
    val n = tmp[0].toInt()
    var k = tmp[1].toLong()
    val course = br.readLine().split(" ").map { it.toInt() }
    var finished = false
    br.close()

    for (i in 0 until n) {
        k -= course[i]
        if (k < 0) {
            println(i + 1)
            finished = true
            break
        }
    }

    if (!finished) {
        for (i in n - 1 downTo 0) {
            k -= course[i]
            if (k < 0) {
                println(i + 1)
                break
            }
        }
    }
}