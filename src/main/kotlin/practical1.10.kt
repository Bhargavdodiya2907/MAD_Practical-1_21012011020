class
Car(info:String,Owner:String,miles:Int,OGPrice:Double,currentPrice:Double){
    lateinit var info:String
    lateinit var Owner:String
    var miles:Int
    var OGPrice:Double
    var currentPrice:Double
    init{
        println("Object of class is created and Init is called")
        this.info = info
        this.Owner = Owner
        this.miles = miles

        this.OGPrice = OGPrice
        this.currentPrice = currentPrice
    }
    fun getCarInformation(): String {
        return info
    }
    fun getOriginalCarPrice(): Double {
        return OGPrice
    }
    fun getCurrentCarPrice(): Double {
        return currentPrice
    }
    fun displayCarInfo(){
        println("----------")
        println("Car Information: ${getCarInformation()}")
        println("Car Owner: $Owner")
        println("Miles Drive: $miles")
        println("Original Car Price: ${getOriginalCarPrice()}")
        println("Current Car Price: ${getCurrentCarPrice()}")
        println("----------\n")
    }
}
fun main() {
    println("21012011020 || Dodiya Bhargav")
    println("Creating Car Class Object car1 in next line")
    val car1 = Car("KIA, 2018","Bhargav",105, 10000.0,98950.0)
    car1.displayCarInfo()
    println("Creating Car Class Object car2 in next line")
    val car2 = Car("Audi, 2019","Chintan",20, 400000.0,399800.0)
    car2.displayCarInfo()
    println("\n**** ArrayList of Car ****")
    val carlist = ArrayList<Car>()
    carlist.add(Car("Swift,2017","Sagar",100,1080000.0,1079000.0))

                carlist.add(Car("I10, 2020","Dev",200,4000000.0,3998000.0))
                carlist[0].displayCarInfo()
                carlist[1].displayCarInfo()
}