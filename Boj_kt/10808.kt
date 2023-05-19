fun main() {
    val map = HashMap<Char, Int>()
    val str = readln()
    for (i in str) {
        val tmp = map[i] ?: 0
        map[i] = tmp + 1
    }

    for (i in 'a'..'z') {
        print("${map[i] ?: 0} ")
    }
}