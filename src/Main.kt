import kotlin.random.Random

fun main(){

  //  val robot1 = Robot("R2D2")
    //val robot2 = Robot("DAW1A", Random.nextInt(-5,6),0)
    val robot3 = Robot("DAW1B", 0, Random.nextInt(-10,11))
    val robot4 = Robot("DAM1", Random.nextInt(-5,6), Random.nextInt(-5,6))

    println(robot3.nuevaDireccionDAW1B())


    // val mov1 = robot1.mover(arrayOf(12, 5, 2))



}