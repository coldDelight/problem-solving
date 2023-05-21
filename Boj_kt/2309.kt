fun main() {
    val h = IntArray(9) { readln().toInt() }

    val tot = h.sum()
    var isChecked = false
    for (i in 0..7) {
        for (j in i + 1..8) {
            if (tot - (h[i] + h[j]) == 100) {
                h[i] = -1
                h[j] = -1
                isChecked = true
                break
            }
        }
        if (isChecked) {
            break
        }
    }
    h.filter { it != -1 }.sorted().forEach {
        println(it)
    }
}