enum class Direccion(private var desc:String) {
    PositiveY("Eje y positivo"),
    PositiveX("Eje positivo X"),
    NegativeY("Eje negativo Y"),
    NegativeX("Eje negativo X");

    companion object {
        fun agregarGrados90(idDireccion: Int): Direccion {
            if (idDireccion >= Direccion.entries.size - 1) {
                return Direccion.entries[0]
            } else {
                return Direccion.entries[idDireccion + 1]
            }
        }
        //TODO HACER FUNCION RESTAR90GRADOS PA RESTAR
    }
}