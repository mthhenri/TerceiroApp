package br.edu.up.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var n1 : TextView
    lateinit var n2 : TextView
    lateinit var resultado : TextView
    lateinit var btnGroup : RadioGroup
    lateinit var btn : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        n1 = findViewById(R.id.num1)
        n2 = findViewById(R.id.num2)
        resultado = findViewById(R.id.resultado)
        btnGroup = findViewById(R.id.grupo)
    }

    fun selecionarBtn(view: View) {
        btn = view as RadioButton
    }

    fun calcularConta(view: View) {

        if(n1 != null && n2 != null){
            when(btnGroup.checkedRadioButtonId){
                R.id.somarBTN -> {
                    val valor = n1.text.toString().toInt() + n2.text.toString().toInt()
                    resultado.text = valor.toString()
                }
                R.id.subBTN -> {
                    val valor = n1.text.toString().toInt() - n2.text.toString().toInt()
                    resultado.text = valor.toString()
                }
                R.id.multBTN -> {
                    val valor = n1.text.toString().toInt() * n2.text.toString().toInt()
                    resultado.text = valor.toString()
                }
                R.id.dividirBTN -> {
                    val valor = n1.text.toString().toInt() / n2.text.toString().toInt()
                    resultado.text = valor.toString()
                } else -> {
                    resultado.text = "erro"
                }
            }
        }

//        return if(operador === "soma") {
//            resultado = n1.text.toString().toInt() + n2.text.toString().toInt()
//        }else if(operador === "subtrair"){
//            resultado = n1.toInt() - n2.toInt()
//            resultado.toString()
//        }else if(operador === "multiplicar"){
//            resultado = n1.toInt() * n2.toInt()
//            resultado.toString()
//        }else if(operador === "dividir"){
//            resultado = n1.toInt() / n2.toInt()
//            resultado.toString()
//        } else {
//            "ERRO"
//        }
    }
}