fun main() {

    val br = System.`in`.bufferedReader()
    val str = br.readLine()
    br.close()

    var check = true
    for (i in str.indices) {
        if (str[i] != str[str.length -1- i]) {
            check = false
        }
    }
    if (check) {
        print(1)
    } else {
        print(0)
    }
}
