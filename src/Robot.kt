class Robot(val nombre:String) {

    constructor(nombre: String, posx: Int, posy: Int = 0): this(nombre) {
        this.posx = posx
        this.posy = 0
        this.direccion = Direccion.NegativeX
    }
    constructor(nombre: String,posy: Int, direccion: Direccion): this(nombre) {
        this.posx = 0
        this.posy = posy
        this.direccion = direccion
    }

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
                        if (nombre == "DAW1A" && posx >= 0){
                            direccion = Direccion.NegativeX
                        }else{
                            direccion = Direccion.PositiveY
                        }
                        posx += paso
                        direccion = Direccion.PositiveY
                    }
            }

                // direccion = Direccion.nuevaDir(direccion.ordinal)
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
    fun nuevaDireccion(): Direccion {
        if(nombre=="jdfjs"){
            direccion = Direccion.agregarGrados90(direccion.ordinal)
            return Direccion.agregarGrados90(direccion.ordinal);
        }
    }
    override fun toString(): String {
        return "R2D2 está en ($posx, $posy) $direccion"
    }
}