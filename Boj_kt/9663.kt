fun main() {
    val n = readln().toInt()

    val isUsed1 = BooleanArray(n) { false }
    val isUsed2 = BooleanArray(n*2-1) { false }
    val isUsed3 = BooleanArray(n*2-1) { false }

    var cnt = 0
    
    fun bt(l: Int) {
        if (l == n) {
            cnt++
            return
        }
        for (i in 0 until n) {
            if (isUsed1[i] || isUsed2[i + l] || isUsed3[l - i + n - 1]) {
                continue
            }

            isUsed1[i] = true
            isUsed2[i + l] = true
            isUsed3[l - i + n - 1] = true

            bt(l + 1)

            isUsed1[i] = false
            isUsed2[i + l] = false
            isUsed3[l - i + n - 1] = false
        }
    }

    bt(0)
    println(cnt)
}
