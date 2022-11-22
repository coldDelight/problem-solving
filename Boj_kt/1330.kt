fun main(){
    val num = readLine()!!.split(" ").map { it.toInt() }
    if(num[0]<num[1]){
        print("<")
    }else if(num[0]>num[1]){
        print(">")
    }else{
        print("==")
    }
}