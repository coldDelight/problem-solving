fun main() {
    val n = readln().toInt()
    val arr = Array(n) { readln().split(" ").map { it.toInt() } }

    var cnt=1
    arr.forEach { base ->
        cnt = 1
        arr.forEach { compare ->
            if (base[0] < compare[0] && base[1] < compare[1]) {
                cnt++
            }
        }
        print("$cnt ")
    }
}