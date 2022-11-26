fun main() {
    val word = readLine()!!
    val origin = mutableMapOf<Char,Int>()
    repeat(26){
        origin[(it+97).toChar()] = -1
    }
    repeat(word.length){
        if(origin[word[it]] == -1){
            origin[word[it]] = it
        }
    }
    origin.map { it -> print("${it.value} ") }
}