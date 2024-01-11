class HackerRankCompareTheTriplets {
    fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {

        var bob = 0
        var alice = 0

        for (i in 0..2){
            if(a[i]>b[i])
                bob++
            if(a[i]<b[i])
                alice++
        }

        return arrayOf(bob, alice)
    }
}