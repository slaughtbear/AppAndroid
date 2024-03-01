package mx.edu.utch.promedioapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import mx.edu.utch.promedioapp.Controlador.CalculoController
import mx.edu.utch.promedioapp.Vista.ICalculoView

class MainActivity : AppCompatActivity(), ICalculoView, View.OnClickListener {

    private val controller = CalculoController(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonCalcular: Button = findViewById(R.id.btnCalcular)
        botonCalcular.setOnClickListener(this)
    }

    //comentario para verificar que ya esta en git

    override fun onClick(v: View?) {
        if (v != null) {
            if (v.id == R.id.btnCalcular) {
                realizarCalculo()
            }
        }
    }

    private fun realizarCalculo() {
        val campoNombre: EditText = findViewById(R.id.idNombre)
        val campoCali1: EditText = findViewById(R.id.idCali1)
        val campoCali2: EditText = findViewById(R.id.idCali2)
        val campoCali3: EditText = findViewById(R.id.idCali3)

        val nombre: String = campoNombre.text.toString()
        val cali1: Double = campoCali1.text.toString().toDouble()
        val cali2: Double = campoCali2.text.toString().toDouble()
        val cali3: Double = campoCali3.text.toString().toDouble()

        controller.realizarCalculo(nombre, cali1, cali2, cali3)
    }

    override fun mostrarResultado(resultado: String) {
        val mensajeResult: TextView = findViewById(R.id.idRes)
        mensajeResult.text = resultado
        Toast.makeText(this, resultado, Toast.LENGTH_LONG).show()
    }
}
