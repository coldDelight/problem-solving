fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()

    val n = br.readLine().toInt()
    val map = mutableMapOf<Int, Int>()
    br.readLine().split(" ").map {
        val num = it.toInt()
        if (!map.containsKey(num)) {
            map[num] = 1
        } else {
            map[num] = map[num]!! + 1
        }
    }

    val m =  br.readLine()
    br.readLine().split(" ").map {
        val num = it.toInt()
        if (map.containsKey(num)) {
            bw.write("${map[num]} ")
        } else {
            bw.write("0 ")
        }
    }
    br.close()
    bw.flush()
    bw.close()
}