package com.SQM.proyectosqm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMostrar: Button = findViewById(R.id.button)
        btnMostrar.setOnClickListener { createShowToast() }

        val btnImg: ImageButton = findViewById(R.id.imageButton)
        btnImg.setOnClickListener { createShowToast2() }
    }

    private fun createShowToast() {
        val text = getNombre()
        val btnCircular = getButtonsCircular()
        val check1 = getCheck1()
        val check2 = getCheck2()
        val toogle = getToogle()
        val switch = getSwitch()

        val toast = Toast(this).apply {
            setText(text + "\n" + btnCircular + "\n" + check1 + "\n" + check2 + "\n" + toogle + "\n" + switch)

        }
        toast.show()
    }

    private fun getNombre(): String {
        val nombre: EditText = findViewById(R.id.editText)
        return nombre.text.toString()
    }

    private fun getButtonsCircular(): String {
        val btnR1 = findViewById<RadioButton>(R.id.radio_btn_1)
        val btnR2 = findViewById<RadioButton>(R.id.radioButton2)

        if (btnR1.isChecked === true) {
            return "El boton 1 esta seleccionado"
        } else if (btnR2.isChecked === true) {
            return "El boton 2 esta seleccionado"
        }else{
            return "No se selecciono ningun boton"
        }
    }

    private fun getCheck1(): String {
        val check1 = findViewById<CheckBox>(R.id.checkBox)


        if (check1.isChecked === true) {
            return "El check 1 esta seleccionado"
        }
        return "El check 1 no esta seleccionado"
    }


    private fun getCheck2(): String {
        val check2 = findViewById<CheckBox>(R.id.checkBox2)

        if (check2.isChecked === true) {
            return "El check 2 esta seleccionado"
        }
        return "El check 2 no esta seleccionado"
    }

    private fun getToogle(): String {
        val toogle = findViewById<ToggleButton>(R.id.toggleButton)

        if (toogle.isChecked === true) {
            return "El toogle esta seleccionado"
        }
        return "El toogle no esta seleccionado"
    }

    private fun getSwitch(): String {
        val switch = findViewById<Switch>(R.id.switch1)

        if (switch.isChecked === true) {
            return "El switch esta activado"
        }
        return "El switch no esta desactivado"
    }

    private fun createShowToast2() {
        val textBtnImg = "Se oprimiio el boton de imagen";

        val toast = Toast(this).apply {
            setText(textBtnImg)

        }
        toast.show()
    }
}
