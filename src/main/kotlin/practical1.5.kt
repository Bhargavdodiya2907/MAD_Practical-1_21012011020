fun main()
{
    println("Enter the number")
    var a=readLine()!!.toInt()
    when (a)
    {
        1->println("January")
        2->println("February")
        3->println("March")
        4->println("April")
        5->println("May")
        6->println("June")
        7->println("July")
        8->println("August")
        9->println("September")
        10->println("Octomber")
        11->println("November")
        12->println("December")
        else->{println("Enter a Proper Character")}
    }
}