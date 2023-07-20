fun main(){
    print("Enter the num:")
    var num= readLine()!!.toInt()
    var ans=fact(num)
    println("fact:"+ans)
}
fun fact(num:Int):Int{
    if(num==1 || num==0) {
        return 1
    }
    else{
        return num*fact(num-1)
    }
}