fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = IntArray(n + 1) { 0 }
    repeat(m) {
        val (i, j, k) = readln().split(" ").map { it.toInt() }
        for (x in i..j) {
            arr[x] = k
        }
    }
    for (i in arr.indices){
        if (i!=0){
            print("${arr[i]} ")
        }
    }
}