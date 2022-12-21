fun main() {
    val n = readln().toInt()
    var check =1
    var i = 1
    while(n>check){
        check += 6 * i
        i++
    }
    print(i)
}