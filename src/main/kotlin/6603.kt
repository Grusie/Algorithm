import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var flag : Array<Boolean>
    var array : Array<Int>

    while (true) {
        val st = StringTokenizer(br.readLine())
        var order = st.nextToken().toInt()
        array = Array(order) { 0 }
        flag = Array(order){false}
        if (order == 0)
            break

        for (i in 0 until order) {
            array[i] = st.nextToken().toInt()
        }
        dfs(0, 0, array ,flag)
        println()
    }

}
fun dfs(start:Int, depth: Int,array: Array<Int>, flag : Array<Boolean>){
    if(depth == 6){
        for(i in array.indices){
            if(flag[i]){
                print("${array[i]} ")
            }
        }
        println()
    }

    for(i in start until array.size){
        flag[i] = true
        dfs(i+1, depth+1, array, flag)
        flag[i] = false
    }
}