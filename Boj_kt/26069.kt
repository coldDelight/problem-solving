fun main() {
    val br = System.`in`.bufferedReader()
    val n = readln().toInt()
    val cnt = HashMap<String, Boolean>()
    repeat(n) {
        val name = br.readLine().split(" ")
        if (name[0] == "ChongChong" || name[1] == "ChongChong") {
            cnt[name[0]] = true
            cnt[name[1]] = true
        } else {
            if (cnt[name[0]] == true || cnt[name[1]] == true) {
                cnt[name[0]] = true
                cnt[name[1]] = true
            }
        }
    }
    br.close()
    println(cnt.filter { it.value }.size)
}