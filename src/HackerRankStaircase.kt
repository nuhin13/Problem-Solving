import java.util.logging.LogManager

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

    fun miniMaxSum(arr: Array<Int>): Unit {
        val s = arr.sortedArrayDescending()
        println(s.joinToString())
        var a:Long  = 0

        for(number in s){
            a += number.toLong()
        }
        println(a)
        println("${a - s[0]} ${a-s[4]}")
    }
}