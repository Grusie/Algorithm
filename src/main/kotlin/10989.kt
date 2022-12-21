import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
//    val list = ArrayList<Int>()
    val size = br.readLine().toInt()
    val list = IntArray(size)

    for(i in 0 until size){
        //list.add(br.readLine().toInt())
        list[i] = br.readLine().toInt()
    }
    br.close()

    list.sort()
    for(i in list){
        bw.write("$i\n")
    }
    bw.flush()
    bw.close()
}