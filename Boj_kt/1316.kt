fun main() {
    val num = readLine()!!.toInt()
    var cnt = num
    repeat(num) {
        val str: String = readLine()!!
        val target = mutableMapOf<Char, Int>()
        val count = str.toSet()

        for (i in count) {
            target[i] = str.count { it == i }
        }
        for (i in target) {
            val firstIndex = str.indexOf(i.key)
            val lastIndex = str.lastIndexOf(i.key)
            if (lastIndex - firstIndex == i.value - 1) {

            }else{
                cnt--
                break
            }
        }
    }
    print(cnt)
}
