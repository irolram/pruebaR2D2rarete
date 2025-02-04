class Robot(val nombre:String, var posx: Int = 0, var posy: Int = 0, val direccion:String) {


    fun mover(elemento: Array<Int>){

    }

    fun obtenerPosicion(){

        var positivoX = 0
        var negativoX = 0
        var positivoY = 0
        var negativoY = 0

         posx =  positivoX - negativoX
         posy =  positivoY - negativoY

        return
    }
    fun obtenerDireccion():String{

        return
    }

    override fun toString(): String {
        return "R2D2 está en ($posx, $posy) positiveX"
    }
}