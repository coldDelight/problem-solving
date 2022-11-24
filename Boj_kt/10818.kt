fun main() {
    val number  = readLine()!!.split(" ").map { it.toInt() }
    print("${number.minOrNull()} ${number.maxOrNull()}")
}