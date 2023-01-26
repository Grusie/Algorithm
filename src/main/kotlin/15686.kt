import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

private lateinit var chicken: ArrayList<Pair<Int, Int>>
private lateinit var home: ArrayList<Pair<Int, Int>>
private lateinit var visit: Array<Boolean>
private var ans = Int.MAX_VALUE
private var open = 0
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var st = StringTokenizer(br.readLine())

    val size = st.nextToken().toInt()
    open = st.nextToken().toInt()

    chicken = ArrayList()
    home = ArrayList()

    for (i in 0 until size) {
        st = StringTokenizer(br.readLine())
        for (j in 0 until size) {
            var data = st.nextToken()
            if (data == "2")
                chicken.add(Pair(i, j))
            else if (data == "1")
                home.add(Pair(i, j))
        }
    }

    visit = Array(chicken.size) { false }
    dfs(0, 0)
    br.close()
    bw.write("$ans")
    bw.flush()
    bw.close()
}

private fun dfs(start: Int, depth: Int) {
    if (depth == open) {
        var result = 0
        for (i in home) {
            var temp = Int.MAX_VALUE
            for (j in 0 until chicken.size) {
                if (visit[j]) {
                    if (temp == 1)
                        break
                    var dist = dist(i, chicken[j])
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
        dfs(i + 1, depth + 1)
        visit[i] = false
    }
}

private fun dist(homePoint: Pair<Int, Int>, chickenPoint: Pair<Int, Int>): Int {
    return kotlin.math.abs(homePoint.first - chickenPoint.first) + kotlin.math.abs(homePoint.second - chickenPoint.second)
}