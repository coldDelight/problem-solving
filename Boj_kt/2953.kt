fun main() {
    var maxVal = 0
    var maxIndex = 0
    repeat(5) {
        val score = readln().split(" ").sumOf { it.toInt() }
        if (maxVal < score) {
            maxVal = score
            maxIndex = it
        }
    }
    print("${maxIndex + 1} $maxVal")
}