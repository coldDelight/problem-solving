import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val num1 = token.nextToken().toInt()
        val num2 = token.nextToken().toInt()
        val sum = (num1 + num2).toString()
        bw.write("Case #${it+1}: $num1 + $num2 = $sum\n")
    }
    bw.flush()
    bw.close()
}