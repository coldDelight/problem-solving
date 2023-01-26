fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val num  = br.readLine().toInt()
    val arr =  br.readLine().split(" ").map { it.toInt() }
    val arr2 =  arr.distinct().sorted()
    val map = HashMap<Int,Int>()

    br.close()
    repeat(arr2.size){
        map[arr2[it]] = it
    }

    for(i in arr){
        bw.write("${map[i]} ")
    }
    bw.flush()
    bw.close()
}