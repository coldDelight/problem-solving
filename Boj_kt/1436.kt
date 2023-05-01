fun main() {
    var n = readln().toInt()
    var ans = 665

    while (n != 0) {
        ans += 1
        if (ans.toString().contains("666")) {
            n--
        }
    }
    println(ans)
}