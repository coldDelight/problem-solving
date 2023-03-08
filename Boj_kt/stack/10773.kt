import java.util.Stack

fun main() {
    val k = readln().toInt()
    val stack = Stack<Int>()
    repeat(k) {
        val num = readln().toInt()
        if (num == 0) stack.pop()
        else stack.add(num)
    }
    print(stack.sum())
}