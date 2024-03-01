package mx.edu.utch.promedioapp.Modelo

class CalculoModel {
    fun calcularPromedio(cali1: Double, cali2: Double, cali3: Double): Double {
        return (cali1 + cali2 + cali3) / 3
    }

    fun obtenerResultado(promedio: Double): String {
        return if (promedio >= 6) {
            "ha acreditado con un promedio de $promedio"
        } else {
            "no logró acreditar, promedio de $promedio"
        }
    }
}