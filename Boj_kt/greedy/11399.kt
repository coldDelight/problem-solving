fun main() {
    val n = readln().toInt()
    val time = readln().split(" ").map{it.toInt()}.sorted()
    val eachTime = IntArray(n){0}
    var tmp=0

    repeat(n){
        eachTime[it] = time[it] + tmp
        tmp = eachTime[it]
    }

    print(eachTime.sum())
}