
fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    val map = HashMap<String, Boolean>()
    repeat(n) {
        val tmp = br.readLine().split(" ")
        map[tmp[0]] = tmp[1] == "enter"
    }

    map.keys.sortedDescending().forEach {
        if (map[it] == true) {
            println(it)
        }
    }
}