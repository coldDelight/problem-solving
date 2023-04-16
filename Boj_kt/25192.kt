
fun main() {
    val br = System.`in`.bufferedReader()
    val n = readln().toInt()
    val cnt = HashMap<String, Int>()
    var enterCnt = 0
    repeat(n) {
        val name = br.readLine()
        if (name == "ENTER") {
            cnt.clear()
        } else {
            val tmp = cnt[name] ?: 0
            cnt[name] = tmp + 1
            if (cnt[name] == 1) {
                enterCnt++
            }
        }
    }
    br.close()
    println(enterCnt)
}