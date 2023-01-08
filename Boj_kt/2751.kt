fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val n  = br.readLine().toInt()
    val arr = BooleanArray(2000001)

    repeat(n) {
        arr[br.readLine().toInt()+1000000] = true
    }
    br.close()

    repeat(arr.size){
        if(arr[it]){
            bw.write("${it-1000000}\n")
        }
    }
    bw.flush()
    bw.close()
}