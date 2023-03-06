import java.util.Stack

fun main() {
    val t = readln().toInt()

    repeat(t) {
        val stack = Stack<Int>()
        val tmp = readln()
        var res = "YES"
        for (i in tmp) {
            when (i) {
                '(' -> {
                    stack.push(1)
                }
                ')' -> {
                    if (stack.empty()) {
                        res = "NO"
                        break
                    }
                    stack.pop()
                }
            }
        }
        if (stack.isNotEmpty()) {
            res = "NO"
        }
        println(res)
    }
}