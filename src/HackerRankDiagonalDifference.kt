import kotlin.math.abs

class HackerRankDiagonalDifference {
    fun diagonalDifference(arr: Array<Array<Int>>): Int {
        // Write your code here

        var sum1 = 0
        var sum2 = 0
        var j = 0

        for (i in 0 until arr[0].size){
            sum1 += arr[i][j]
            sum2 += arr[i][arr[0].size - 1 - j]
            j++
        }

        return abs(sum1 - sum2)
    }
}