fun main() {
    val n = readln().toInt()
    val lines = IntArray(n) { readln().toInt() }
    var max = 0
    
    lines.sort()
    max = lines.first() * n
    
    lines.forEachIndexed { index, value ->
        if (max < value * (n - index)) {
            max = value * (n - index)
        }

    }
    print(max)
}