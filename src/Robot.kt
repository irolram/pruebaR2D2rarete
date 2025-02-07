import kotlin.random.Random

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
    var direccion = Direccion.PositiveY


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

    fun nuevaDireccionDAW1A(): Direccion {
        when (this.direccion){
            Direccion.PositiveX -> {
                if (posx >= 0){
                    Direccion.NegativeX
                }else{
                    Direccion.NegativeX
                }
            }
            Direccion.PositiveY -> {
                if (posx >= 0){
                    Direccion.NegativeY
                }else{
                    Direccion.PositiveX
                }
            }
            Direccion.NegativeY -> {
                if (posx >= 0){
                    Direccion.PositiveY
                }else{
                    Direccion.NegativeY
                }
            }
            Direccion.NegativeX -> {
                if (posx >= 0){
                    Direccion.PositiveX
                }else{
                    Direccion.PositiveY
                }
            }
        }
        return this.direccion
    }

    fun nuevaDireccionDAW1B(): Direccion {
        direccion = direccion.direccionAleatoria()
        when(this.direccion){
            Direccion.PositiveX -> {
                if (posy >= 0){
                     Direccion.PositiveY
                }else{
                    Direccion.PositiveY
                }
            }
            Direccion.NegativeX -> {
                if (posx >= 0){
                    Direccion.NegativeY
                }else{
                    Direccion.NegativeY
                }
            }
            Direccion.NegativeY -> {
                if (posx >= 0){
                    Direccion.PositiveX
                }else{
                    Direccion.PositiveX
                }
            }
            Direccion.PositiveY -> {
                if (posx >= 0){
                    Direccion.NegativeX
                }else{
                    Direccion.NegativeX
                }
            }
        }
        return direccion
    }

    /*fun nuevaDireccionDAM1(): Direccion {
       direccion = direccion.direccionAleatoria()
    
    }

     */

    override fun toString(): String {
        return "R2D2 está en ($posx, $posy) $direccion"
    }
}