fun main() {
    val c = readLine()!!.toInt()
    repeat(c){
        val student = readLine()!!.split(" ").map { it.toInt() }
        var sum=0
        repeat(student[0]){
            sum+= student[it+1]
        }
        val avg = sum/student[0]
        var cnt =0
        repeat(student[0]){
            if(student[it+1]>avg){
                cnt++
            }
        }
        val percent = cnt.toDouble()/student[0]*100
        print(String.format("%.3f",percent))
        println("%")
    }
}