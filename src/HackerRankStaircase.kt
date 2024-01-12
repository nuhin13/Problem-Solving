class HackerRankStaircase {
    fun staircase(n: Int): Unit {
        for(i in 0 until n){
            var s = ""
            for (j in 0 until(n-(i+1))){
                s += " "
            }
            for (k in (n-(i+1))until n){
                s += "#"
            }
            println(s)
        }
    }
}