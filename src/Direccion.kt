enum class Direccion(private var desc:String) {
    PositiveY("Eje positivo Y"),
    PositiveX("Eje positivo X"),
    NegativeY("Eje negativo Y"),
    NegativeX("Eje negativo X");

    fun direccionAleatoria(): Direccion {
        return Direccion.entries.random()
    }
}