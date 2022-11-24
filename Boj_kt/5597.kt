fun main() {
    val numArr = arrayListOf<Int>()
    val resArr = arrayListOf<Int>()
    repeat(28){
        numArr.add(readLine()!!.toInt())
    }
    repeat(30){
        if(numArr.contains(it+1)){

        }else{
            resArr.add(it+1)
        }
    }
    if(resArr[0]<resArr[1]){
        println(resArr[0])
        println(resArr[1])
    }else{
        println(resArr[1])
        println(resArr[0])
    }
}