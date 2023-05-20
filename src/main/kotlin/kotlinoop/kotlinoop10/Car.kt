package kotlinoop.kotlinoop10

class Car(brand:String,
          model:String,year:Int):Vehicle(brand,model,year) {
              fun refuel(){
                println("Refuelling...")
              }

              override fun accelerate(){
                super.accelerate()
                println("A CAR accelerates!!")
              }
              fun accelerate(speed:Double){
                println("acceleration speed is $speed")
              }
}