enum class Direccion(private var desc:String) {
    PositiveY("Eje y positivo"),
    NegativeY("Eje negativo Y"),
    PositiveX("Eje positivo X"),
    NegativeX("Eje negativo X");

    companion object {
        fun nuevaDir(pos: Int): Direccion {
            if (pos >= Direccion.entries.size - 1) {
                return Direccion.entries[0]
            } else {
                return Direccion.entries[pos + 1]
            }
        }
    }
}