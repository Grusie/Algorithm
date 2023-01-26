import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine())

    val size = st.nextToken().toInt()
    val open = st.nextToken().toInt()
    val house = ArrayList<Pair<Int, Int>>()
    val chicken = ArrayList<Pair<Int, Int>>()
    var ans = Int.MAX_VALUE

    fun dfs(start: Int, count: Int) {
        val visit = Array(chicken.size) { false }
        if (count == open) {
            var result = 0
            for(i in house){
                var temp = Int.MAX_VALUE
                for(j in 0 until chicken.size) {
                    if(visit[j]) {
                        var dist = kotlin.math.abs(i.first - chicken[j].first) + kotlin.math.abs(i.second - chicken[j].second)
                        temp = dist.coerceAtMost(temp)
                    }
                }
                result += temp
            }
            ans = result.coerceAtMost(ans)
            return
        }
        for (i in start until chicken.size) {
            visit[i] = true
            dfs(start + 1, count + 1)
            visit[i] = false
        }
    }

    for (i in 0 until size) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until size) {
            var data = st.nextToken().toInt()
            if (data == 1)
                house.add(Pair(i, j))
            else if (data == 2)
                chicken.add(Pair(i, j))
        }
    }

    dfs(0, 0)
    br.close()
    bw.write("$ans")
    bw.flush()
    bw.close()
}