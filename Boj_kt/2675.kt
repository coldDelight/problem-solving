fun main() {
    val t = readLine()!!.toInt()
    repeat(t){
        val num = readLine()!!.split(" ")
        repeat(num[1].length){it1->
            repeat(num[0].toInt()){
                print(num[1][it1])
            }
        }
        println()
    }
}