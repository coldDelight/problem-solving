fun main() {

    val date = readln().toInt()
    var sum = 0

    val numbers = readln().split(" ").map { it.toInt() }
    for (i in numbers) {
        if (date == i) {
            sum++
        }
    }
    print(sum)
}