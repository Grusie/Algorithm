import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val order = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    var count = 0

    for(i in 0 until order){
        var prime = st.nextToken().toInt()
        var flag = true
        if(prime != 1) {
            for (j in 2 until prime) {
                if (prime % j == 0) {
                    flag = false
                    break
                }
            }
            if (flag)
                count++
        }
    }
    bw.write("$count")
    br.close()
    bw.flush()
    bw.close()
}