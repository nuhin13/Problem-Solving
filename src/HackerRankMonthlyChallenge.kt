import java.util.Arrays

class HackerRankMonthlyChallenge {
    fun timeConversion(s: String): String {
        val split = s.split(":").toMutableList()

        if (split[2][2] == 'P') {
            if (split[0].toInt() != 12)
                split[0] = (split[0].toInt() + 12).toString()
        } else {
            if (split[0].toInt() == 12) {
                split[0] = "00"
            }
        }
        split[2] = split[2].substring(0, 2)
        return "${split[0]}:${split[1]}:${split[2]}"
    }

    var matchInput = arrayOf("aba", "baba", "aba", "xzxb")
    var matchQueriesInput = arrayOf("aba", "xzxb", "ab")

    fun matchingStrings(strings: Array<String>, queries: Array<String>): Array<Int> {
        val stringMap: Map<String, Int> = strings.groupingBy { it }.eachCount()

        val result = IntArray(queries.size)

        for (i in queries.indices) {
            if (stringMap.contains(queries[i]))
                result[i] = stringMap[queries[i]]!!
        }

        return result.toTypedArray()
    }

    fun flippingBits(n: Long): Long {
        println(Integer.toUnsignedString(n.toInt()))
        println(n.inv())
        println(n.inv().toInt())
        println(Integer.toUnsignedString(n.inv().toInt()))

        return Integer.toUnsignedString(n.inv().toInt()).toLong()
    }

    fun lonelyinteger(a: Array<Int>): Int {
        val map: Map<Int, Int> = a.groupingBy { it }.eachCount()
        var result = 0
        for (i in a.indices) {
            if (map[a[i]] == 1){
                result = a[i]
                break
            }
        }
        return result
    }

    fun pangrams(s: String): String {
        val asciMap = IntArray(26)
        val ss = s.lowercase().trim().replace("\\s".toRegex(), "")
        for (i in ss.indices) {
            asciMap[(ss[i].code - 97)]++
        }

        println(asciMap.contentToString())

        return if(asciMap.contains(0))
            "not pangram"
        else
            "pangram"
    }
}

fun main() {
    //println(HackerRankMonthlyChallenge().flippingBits(0))
    //println(HackerRankMonthlyChallenge().lonelyinteger(arrayOf(1,2,3,4,3,2,1)))
    println(HackerRankMonthlyChallenge().pangrams("We promptly judged antique ivory buckles for the next prize"))
}