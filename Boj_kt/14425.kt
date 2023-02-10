fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val a = mutableSetOf<String>()
    var cnt = 0
    repeat(n){
        a.add(readln())
    }
    repeat(m){
        if(a.contains(readln())){
            cnt++
        }
    }
    print(cnt)
}