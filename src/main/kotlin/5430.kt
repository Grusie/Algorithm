import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (count in 0 until br.readLine().toInt()){
        var orders = br.readLine()
        var count = br.readLine().toInt()
        var array = ArrayList<Int>()
        var st = StringTokenizer(br.readLine(), "[,]")
        for(i in 0 until count){
            array.add(st.nextToken().toInt())
        }

        var rCount = 0
        try {
            for (i in orders) {
                when (i) {
                    'R' -> rCount++
                    'D' -> {
                        if(rCount %2 == 0)
                            array.removeAt(0)
                        else array.removeAt(array.lastIndex)
                    }
                }
            }
            if(rCount%2 == 1)
                array.reverse()
            bw.write("${array.joinToString(",", "[", "]")}\n")
        }catch (e: Exception) {
            bw.write("error\n")
        }
    }
    br.close()
    bw.flush()
    bw.close()
}