class Robot(val nombre:String, val posx: Int, val posy: Int, val direccion:String) {

    init {
        var positivoX = 0
        var negativoX = 0
        var positivoY = 0
        var negativoY = 0
    }

    fun mover(elemento: Array<Int>){

    }

    fun obtenerPosicion(){



        var direccionx =  positivoX - negativoX
        var direcciony =  positivoY - negativoY

        return
    }
    fun obtenerDireccion():String{



        return
    }

    override fun toString(): String {
        return "R2D2 está en ($posx, $posy) positiveX"
    }
}