import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())

    for(i in st.nextToken().toInt()..st.nextToken().toInt()){
        var flag = true
        if(i != 1) {
            for (j in 2 ..sqrt(i.toDouble()).toInt()) {
                if (i % j == 0) {
                    flag = false
                    break
                }
            }
            if(flag)
                bw.write("$i\n")
        }
    }

    br.close()
    bw.flush()
    bw.close()
}