package android.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

//        val countUpButton: Button = findViewById(R.id.count_up_button)
//        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
//        Toast.makeText(
//            this, "button clicked",
//            Toast.LENGTH_SHORT
//        ).show()

        val drawableResources = when ((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResources)

//        val resultText: TextView = findViewById(R.id.result_text)
//        resultText.text = randomInt.toString()
    }

//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        if(resultText.text != "6" && resultText.text != "Hello World!"){
//            resultText.text = (resultText.text.toString().toInt() + 1).toString()
//        }
//
//        if(resultText.text == "Hello World!"){
//            resultText.text = "1"
//        }
//
//    }

}