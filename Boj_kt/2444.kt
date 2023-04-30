fun main() {
    val n = readln().toInt()
    for (i in 1..n) {
        for (j in 0 until n - i) {
            print(" ")
        }
        for (j in 0 until (i - 1) * 2 + 1) {
            print("*")
        }
        println()
    }
    for (i in n - 1 downTo 1) {
        for (j in 0 until n - i) {
            print(" ")
        }
        for (j in 0 until (i - 1) * 2 + 1) {
            print("*")
        }
        println()
    }
}