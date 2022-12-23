import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    br.readLine()
    val deck = br.readLine().split(" ").map{it.toInt()}.sorted()
    br.readLine()
    val check = br.readLine().split(" ").map{it.toInt()}

    br.close()

    for(i in check){
        if(deck.binarySearch(i) >= 0)
            bw.write("1 ")
        else bw.write("0 ")
    }
    bw.flush()
    bw.close()
}