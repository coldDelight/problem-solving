import java.util.*

fun main() {
    val stack = Stack<Int>()
    val n = readln().toInt()

    repeat(n) {
        val input = readln().split(" ")

        when (input[0]) {
            "push" -> stack.push(input[1].toInt())
            "pop" -> println(if (stack.empty()) -1 else stack.pop())
            "size" -> println(stack.size)
            "empty" -> println(if (stack.empty()) 1 else 0)
            "top" -> println(if (stack.empty()) -1 else stack.peek())
        }
    }
}