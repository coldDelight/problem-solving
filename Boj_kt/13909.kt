fun main() {
    val n = readln().toInt()
    var cnt = 0
    var i = 1
    while (i * i <= n) {
        cnt++
        i++
    }
    println(cnt)
}