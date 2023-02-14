fun main() {
    val (n,m) = readln().split(" ").map { it.toInt() }
    val map = mutableMapOf<String,String>()
    repeat(n){
        val inputData = readln()
        map[inputData] = (it+1).toString()
        map[(it+1).toString()] = inputData
    }
    repeat(m){
        val outputData = readln()
        println(map[outputData])
    }
}