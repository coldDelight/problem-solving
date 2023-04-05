fun main() {
    val x = readln().toInt()
    val cnt = x.toString(2).count { it == '1' }
    
    println(cnt)
}