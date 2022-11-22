fun main(){
    val num = readLine()!!.split(" ").map { it.toInt() }
    if(num[1]<45){
        if(num[0]==0){
            print("23 ${60-(45-num[1])}")
        }else{
            print("${num[0]-1} ${60-(45-num[1])}")
        }
    }else{
        print("${num[0]} ${num[1]-45}")
    }
}