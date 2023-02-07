val bw = System.out.bufferedWriter()

fun main() {
    val br = System.`in`.bufferedReader()
    val n = br.readLine().toInt()
    br.close()
    repeat(n){it1->
        repeat(n){it2->
            printStar(it1,it2,n)
        }
        bw.newLine()
    }
    bw.flush()
    bw.close()
}

fun printStar(x:Int,y:Int,n:Int){
    if((x/n)%3==1 && (y/n)%3==1){
        bw.write(" ")
    }else{
        if(n/3==0){
            bw.write("*")
        }else{
            printStar(x,y,n/3)
        }
    }
}