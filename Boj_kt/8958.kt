fun main() {
    val n = readLine()!!.toInt()
    repeat(n){
        val ox = readLine()!!
        var score = 0
        var point = 1

        repeat(ox.length){
                if(ox[it] == 'O'){
                    score+=point
                    point++
                }else{
                    point=1
                }
            }
        println(score)
    }
}