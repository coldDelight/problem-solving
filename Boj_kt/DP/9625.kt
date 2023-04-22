fun main() {
    val k = readln().toInt()

    val dpA = IntArray(k + 1) { 0 }
    val dpB = IntArray(k + 1) { 0 }

    dpB[1] = 1
    for (i in 2..k) {
        dpB[i] = dpA[i - 1] + dpB[i - 1]
        dpA[i] = dpB[i - 1]
    }

    println("${dpA[k]} ${dpB[k]}")
}