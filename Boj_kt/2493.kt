import java.util.Stack

fun main() {
    val br = System.`in`.bufferedReader()
    val sb = StringBuffer()

    val n = br.readLine().toInt()
    val signal = br.readLine().split(" ").map { it.toInt() }

    val stack = Stack<Pair<Int,Int>>()

    stack.push(signal[0] to 0)

    for (i in signal.indices){

        while (stack.isNotEmpty()){
            if(stack.peek().first>signal[i]){
                sb.append("${stack.peek().second+1} ")
                break
            }
            stack.pop()
        }
        if (stack.empty()){
            sb.append("0 ")
        }
        stack.push(signal[i] to i)
    }
    br.close()
    print(sb.toString())
}