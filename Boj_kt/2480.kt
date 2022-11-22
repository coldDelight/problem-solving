fun main() {
    val dice = readLine()!!.split(" ").map { it.toInt() }

    if (dice[0] == dice[1] && dice[1] == dice[2]) {
        print("${10000+(dice[0]*1000)}")
    }else if(dice[0]== dice[1]&& dice[1]!=dice[2]){
        print("${1000+(dice[0]*100)}")
    }else if(dice[0]==dice[2] && dice[0]!=dice[1]){
        print("${1000+(dice[0]*100)}")
    }else if(dice[1]==dice[2] && dice[0]!=dice[1]){
        print("${1000+(dice[1]*100)}")
    }else{
        val list = dice.sorted()
        print("${list[2]*100}")
    }
}
