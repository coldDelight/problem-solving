import kotlin.math.roundToInt

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val num  = br.readLine().toInt()
    val numbers = IntArray(num)

    repeat(num){
        numbers[it] = br.readLine().toInt()
    }
    br.close()


    bw.write("${numbers.average().roundToInt()}\n")
    bw.write("${numbers.sorted()[num/2]}\n")

    val map = numbers.groupBy { it }
    val max = map.maxOfOrNull { it.value.size }
    val maxMap = map.filter { it.value.size == max }
    if(maxMap.keys.size==1){
        bw.write("${maxMap.keys.sorted()[0]}\n")
    }else{
        bw.write("${maxMap.keys.sorted()[1]}\n")

    }
    
    bw.write("${numbers.sorted()[num-1]-numbers.sorted()[0]}\n")

    bw.flush()
    bw.close()
}