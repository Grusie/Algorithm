import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val order = br.readLine().toInt()
    val array = Array(order){Array(order){0}}
    var st : StringTokenizer

    for(i in 0 until order) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until order) {
            array[i][j] = st.nextToken().toInt()
        }
    }

    for(i in 0 until order) {
        for (j in 0 until order) {
            array[i][j] + array[j][i]
        }
    }

}