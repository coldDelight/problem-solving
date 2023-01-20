fun main() {
    val num = readln().toInt()
    val str = mutableMapOf<Int,MutableSet<String>>()
    repeat(num){
        val tmp = readln()
        if(str[tmp.length]?.isEmpty() == false){
            str[tmp.length]?.add(tmp)
        }else{
            str[tmp.length] = mutableSetOf<String>(tmp)
        }
    }
    for(i in str.keys.sorted()){
        str[i]?.sorted()?.forEach(){
            println(it)
        }
    }
}