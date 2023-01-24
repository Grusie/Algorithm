import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Integer.min
import java.util.StringTokenizer
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val order = br.readLine().toInt()
    val array = Array(order){Array(order){0}}
    var st : StringTokenizer
    val visit = Array(order){false}
    var diff = Int.MAX_VALUE

    fun dfs(start : Int, depth : Int){
        if(depth == order/2){
            var startScore = 0
            var linkScore= 0
            for(i in 0 until order-1) {
                for (j in i + 1 until order) {
                    if (visit[i] && visit[j]) {
                        startScore += array[i][j]
                        startScore += array[j][i]
                    }
                    else if(!visit[i] && !visit[j]){
                        linkScore += array[i][j]
                        linkScore+= array[j][i]
                    }
                }
            }

            diff = min(abs(startScore - linkScore),diff)

            return
        }

        for(i in start until order){
            visit[i] = true
            dfs(i+1, depth+1)
            visit[i] = false
        }
    }

    for(i in 0 until order) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until order) {
            array[i][j] = st.nextToken().toInt()
        }
    }

    dfs(0, 0)
    br.close()
    bw.write("$diff")
    bw.flush()
    bw.close()
}
