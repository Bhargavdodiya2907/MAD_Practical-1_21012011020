import java.util.Scanner
fun main(){
    println("21012011020 || Dodiya Bhargav")
    var reader = Scanner(System.`in`)
    println("Enter the array size : ")
    var size = reader.nextInt()
    println("Enter the element : ")
    var arr = Array<Int>(size) { readLine()!!.toInt() }
    var max = arr[0]
    println("Array is :")
    println(arr.contentToString())
    for (i in 0..arr.size-1)
        if(max < arr[i])

    {
        max = arr[i]
    }
    println("Max is : $max")
}
