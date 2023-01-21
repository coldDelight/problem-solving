fun main() {
    val num = readln().toInt()
    val str = mutableMapOf<Int,MutableList<String>>()
    repeat(num){
        val tmp = readln().split(" ")

        if(str[tmp[0].toInt()]?.isEmpty() == false){
            str[tmp[0].toInt()]?.add(tmp[1])
        }else{
            str[tmp[0].toInt()] = mutableListOf<String>(tmp[1])
        }
    }
    for(i in str.keys.sorted()){
        str[i]?.forEach(){
            println("$i $it")
        }
    }
}
