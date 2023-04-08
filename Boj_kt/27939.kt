fun main() {
    val n = readln().toInt()
    val types = readln().split(" ")
    val (m, k) = readln().split(" ").map { it.toInt() }

    var res = 'P'
    val assistants = mutableListOf<Boolean>()
    repeat(m) {
        val type = readln().split(" ").map { it.toInt() }
        for (i in type) {
            if (types[i - 1] == "P") {
                assistants.add(false)
                break
            }
        }
        if (assistants.size == it) {
            assistants.add(true)
        }
    }
    for (i in assistants) {
        if (i) {
            res = 'W'
            break
        }
    }
    println(res)
}