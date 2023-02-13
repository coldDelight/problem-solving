fun main() {
    val str = readln()
    val set = mutableSetOf<String>()

    repeat(str.length){
        for(i in it+1..str.length){
            if(!set.contains(str.substring(it,i))){
                set.add(str.substring(it,i))
            }
        }
    }
    print(set.size)
}