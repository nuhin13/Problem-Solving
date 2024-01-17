import java.util.Arrays

class HackerRankMonthlyChallenge {
    fun timeConversion(s: String): String {
        val split = s.split(":").toMutableList()

        if(split[2][2] == 'P'){
            if(split[0].toInt() != 12)
                split[0] = (split[0].toInt() + 12).toString()
        } else {
            if(split[0].toInt() == 12) {
                split[0] = "00"
            }
        }
        split[2] = split[2].substring(0,2)
        return "${split[0]}:${split[1]}:${split[2]}"
    }

    var matchInput = arrayOf("aba", "baba", "aba", "xzxb")
    var matchQueriesInput = arrayOf("aba", "xzxb", "ab")

    fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
        val stringMap: Map<String, Int> = strings.groupingBy { it }.eachCount()

        val result = IntArray(queries.size)

        for (i in queries.indices){
            if(stringMap.contains(queries[i]))
               result[i] = stringMap[queries[i]]!!
        }

        return  result.toTypedArray()
    }
}