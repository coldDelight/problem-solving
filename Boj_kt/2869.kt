import kotlin.math.ceil
fun main() {
    val (a,b,v) = readln().split(" ").map { it.toDouble() }
    val res = ceil(((v-b)/(a-b))).toInt()
    print(res)
}