fun main() {
    var num = readln().toInt()
    var i =1
    val a:Int
    val b:Int

    while(num>i){
        num-=i
        i+=1
    }

    if(i%2==0){
        a=num
        b= i-num+1
    }else{
        a= i-num+1
        b=num
    }
    print("$a/$b")
}