package najuarahmahputri.polbeng.ac.id.kubus

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputEdge: EditText
    private lateinit var buttonCalculateVolume: Button
    private lateinit var buttonCalculateSurfaceArea: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputEdge = findViewById(R.id.inputEdge)
        buttonCalculateVolume = findViewById(R.id.buttonCalculateVolume)
        buttonCalculateSurfaceArea = findViewById(R.id.buttonCalculateSurfaceArea)
        resultTextView = findViewById(R.id.resultTextView)

        buttonCalculateVolume.setOnClickListener {
            calculateVolume()
        }

        buttonCalculateSurfaceArea.setOnClickListener {
            calculateSurfaceArea()
        }
    }

    private fun calculateVolume() {
        val edge = inputEdge.text.toString().toDoubleOrNull()
        if (edge != null) {
            val volume = edge * edge * edge
            resultTextView.text = getString(R.string.volume_result, volume)
        } else {
            resultTextView.text = getString(R.string.result)
        }
    }

    private fun calculateSurfaceArea() {
        val edge = inputEdge.text.toString().toDoubleOrNull()
        if (edge != null) {
            val surfaceArea = 6 * edge * edge
            resultTextView.text = getString(R.string.surface_area_result, surfaceArea)
        } else {
            resultTextView.text = getString(R.string.result)
        }
    }
}
