fun main() {
    val n = readLine()!!.toInt()
    repeat(n) { i ->
        repeat(n) { j ->
            if(i>=j){
                print("*")
            }
        }
        println("")
    }
}