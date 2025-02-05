class Robot(val nombre:String) {


    var posx: Int = 0
    var posy: Int = 0
    private var direccion = Direccion.PositiveY

    init {
        this.posx = 0
        this.posy = 0
    }

    fun mover(elemento: Array<Int>){

        for(paso in elemento){
            if (paso != 0) {
                when (direccion){
                    Direccion.PositiveY -> {
                        posy += paso
                        direccion = Direccion.NegativeX
                    }
                    Direccion.NegativeX -> {
                        posx -= paso
                        direccion = Direccion.NegativeY
                    }
                    Direccion.NegativeY -> {
                        posy -= paso
                        direccion = Direccion.PositiveX
                    }
                    Direccion.PositiveX -> {
                        posx += paso
                        direccion = Direccion.PositiveY
                    }
            }


            }
        }


    }

    /*fun obtenerPosicion():List<Int>{

        val posicion = mutableListOf(posx, posy)

        return posicion
    }

     */

    fun obtenerPosicion() = "($posx, $posy)"
    fun obtenerDireccion() = direccion

    override fun toString(): String {
        return "R2D2 está en ($posx, $posy) $direccion"
    }
}