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
    val close = st.nextToken().toInt()
    val visit = Array(size) { false }
    val house = mutableListOf<Pair<Int, Int>>()
    val chicken = mutableListOf<Pair<Int, Int>>()
    var data: Int
    var dist: Int
    var ans = Int.MAX_VALUE

    fun dfs(start: Int, count: Int) {
        if (count == close) {
            var result = 0
            for(i in house){
                var temp = Int.MAX_VALUE
                for(j in 0 until chicken.size) {
                    if(visit[j]) {
                        dist = kotlin.math.abs(i.first - chicken[j].first) + kotlin.math.abs(i.second - chicken[j].second)
                        temp = dist.coerceAtMost(temp)
                    }
                }
                result += temp
            }
            ans = result.coerceAtMost(ans)
            return
        }
        if (start == chicken.size)
            return

        for (i in start until size) {
            visit[i] = true
            dfs(i + 1, count + 1)
            visit[i] = false
        }
    }

    for (i in 0 until size) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until size) {
            data = st.nextToken().toInt()
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