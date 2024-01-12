class HackerRankTest {

    fun tableOfContents(text: Array<String>): Array<String> {
        // Write your code here
        val re: ArrayList<String> = arrayListOf()
        var title = 0
        var subTitle =0

        for (x in text) {
            if(x.startsWith("#")){
                val values = x.split("\\s+".toRegex())
                if(x[1] == '#'){
                    subTitle++
                    re.add("${title}.${subTitle} ${x.drop(1)}")
                } else{
                    title++
                    re.add("$title . ${values[1]}")
                }
            }
        }

        return  re.toTypedArray()
    }


    fun firstOccurrence(s: String, x: String): Int {
        var r = -1

        for (i in s.indices) {
            if(i>s.length || i+x.length > s.length){
                r = -1
                break
            }
            println(s)
            println(i)

           val sub = s.subSequence(i, i+x.length)

            println(sub)
            if(sub == x){
                r = i
                break
            }
        }

        println(r)
        return r
    }

    fun fizzBuzz(n: Int) {
        var a: StringBuilder
        for (i in 1..n) {
            a = StringBuilder()
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0 && i % 5 != 0) {
                    a.append("Fizz")
                } else if (i % 3 != 0 && i % 5 == 0) {
                    a.append("Buzz")
                } else {
                    a.append("Fizz Buzz")
                }
            } else a.append(i)
            println(a.toString())
        }
    }
}
