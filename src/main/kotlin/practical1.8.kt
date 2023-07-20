import java.util.*

fun main(){
    var a= arrayOf(20,15,42,26,10)
    println(Arrays.deepToString(a))

    var b= IntArray(5)
    b[0]=10
    b[1]=12
    b[2]=15
    b[3]=20
    b[4]=24
    for (i in 0 ..  b.size-1){
        println(""+b[i])

        var c= intArrayOf(21,45,26,95,10)
        for(j in 0..c.size-1){
            println(""+c[j])
        }

    }

}