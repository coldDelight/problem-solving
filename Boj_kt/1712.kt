fun main() {
    val num = readLine()!!.split(" ").map{it.toInt()}
    if(num[1]>=num[2]){
        print("-1")
    }else{
        val res = num[0] / (num[2]-num[1])+1
        print(res)
    }
}
