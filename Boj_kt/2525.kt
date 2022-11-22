fun main(){
    val now = readLine()!!.split(" ").map { it.toInt() }
    val target = readLine()!!.toInt()
    val targetH = target/60
    val targetM = target%60
    if(now[1]+targetM>=60){
        if(now[0]+targetH+1>23){
            println("${(now[0]+targetH)+1-24} ${(now[1]+targetM)-60}")
        }else{
            println("${(now[0]+targetH)+1} ${(now[1]+targetM)-60}")
        }
    }else{
        if(now[0]+targetH>23){
            println("${(now[0]+targetH)-24} ${now[1]+targetM}")
        }else{
            print("${now[0]+targetH} ${now[1]+targetM}")
        }
    }
}