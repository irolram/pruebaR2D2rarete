class Robot(val nombre:String) {


    var posx: Int = 0
    var posy: Int = 0
    val direccion:String = ""

    init {
        this.posx = 0
        this.posy = 0
        var direccion = "PositiveY"
    }

    fun mover(elemento: Array<Int>){

        for (i in elemento){

        }

    }

    fun obtenerPosicion():List<Int>{

        val posicion = mutableListOf(posx, posy)

        return posicion
    }
    fun obtenerDireccion():String{

        when (direccion){
            1 -> positivoX
            2 -> negativoX
            3 -> positivoY
            4 -> negativoY
         }

        return direccion
    }

    override fun toString(): String {
        return "R2D2 está en ($posx, $posy) $direccion"
    }
}