fun main() {
    val n = readLine()!!.toInt()
    repeat(n) { i ->
        repeat(n) { j ->
            if(i+1<n-j){
                print(" ")
            }else{
                print("*")
            }
        }
        println("")
    }
}