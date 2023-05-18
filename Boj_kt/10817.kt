fun main() {
    val arr = readln().split(" ").map { it.toInt() }
    val tmp = intArrayOf(arr[0],arr[1],arr[2])
    tmp[tmp.indexOf(tmp.minOrNull()?:0)] = -1
    tmp[tmp.indexOf(tmp.maxOrNull()?:0)] = -1
    print(tmp.maxOrNull())
}