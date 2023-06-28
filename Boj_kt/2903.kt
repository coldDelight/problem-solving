fun main() {
    val n = readln().toInt()
    var x = 3
    val arr = IntArray(16) { 0 }
    for (i in 1..15) {
        arr[i] = x * x
        x = x + x - 1
    }
    print(arr[n])
}