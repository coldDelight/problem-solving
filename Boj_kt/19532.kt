fun main() {
    val arr = readln().split(" ").map { it.toInt() }
    for (i in -999..999) {
        for (j in -999..999) {
            if (arr[0] * i + arr[1] * j == arr[2] && arr[3] * i + arr[4] * j == arr[5]) {
                print("$i $j")
            }
        }
    }
}