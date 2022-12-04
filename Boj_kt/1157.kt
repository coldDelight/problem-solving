fun main() {
    val str = readLine()!!.uppercase()
    val cntMap = mutableMapOf<Char,Int>()
    for (s:Char in str){
        if(cntMap.containsKey(s)){
            cntMap[s] = cntMap[s]!!.plus(1)
        }else{
            cntMap[s] = 1
        }
    }
    val maxCnt = cntMap.values.maxOrNull()
    var count = 0
    for (cnt in cntMap.values){
        if(maxCnt==cnt){
            count++
        }
    }
    if(count>1){
        print("?")
    }else{
        val res =cntMap.filterValues { it==maxCnt }.keys.toList()
        print(res[0])
    }
}