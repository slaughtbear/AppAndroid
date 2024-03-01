package mx.edu.utch.promedioapp.Controlador

import mx.edu.utch.promedioapp.Modelo.CalculoModel
import mx.edu.utch.promedioapp.Vista.ICalculoView

class CalculoController(private val view: ICalculoView) {

    private val model = CalculoModel()

    fun realizarCalculo(nombre: String, cali1: Double, cali2: Double, cali3: Double) {
        val promedio = model.calcularPromedio(cali1, cali2, cali3)
        val resultado = model.obtenerResultado(promedio)
        val mensaje = "Hola $nombre usted $resultado"
        view.mostrarResultado(mensaje)
    }
}