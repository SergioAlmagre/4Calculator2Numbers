package com.example.a4calculadora2numeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var res:Int

        var btSum = findViewById<Button>(R.id.btSum)
        var btSub = findViewById<Button>(R.id.btSubtraction)
        var btMul = findViewById<Button>(R.id.btMultipli)
        var btSpl = findViewById<Button>(R.id.btSplit)
        var btCle = findViewById<Button>(R.id.btClean)
        var n1 = findViewById<EditText>(R.id.n1)
        var n2 = findViewById<EditText>(R.id.n2)
        var result = findViewById<TextView>(R.id.idResult)

        btSum.setOnClickListener{
            if(areCorrect(n1,n2)){
                res = n1.text.toString().toInt() +  n2.text.toString().toInt()
                result.setText(res.toString())
            }
        }

        btSub.setOnClickListener{
            if(areCorrect(n1,n2)) {
                res = n1.text.toString().toInt() - n2.text.toString().toInt()
                result.setText(res.toString())
            }
        }

        btMul.setOnClickListener{
            if(areCorrect(n1,n2)){
            res = n1.text.toString().toInt() *  n2.text.toString().toInt()
            result.setText(res.toString())
            }
        }

        btSpl.setOnClickListener {
            if (areCorrect(n1, n2)) {
            res = n1.text.toString().toInt() / n2.text.toString().toInt()
            result.setText(res.toString())
            }
        }

        btCle.setOnClickListener{
            n1.setText("")
            n2.setText("")
            result.setText("0")
        }

    }

    fun areCorrect(n1:EditText, n2:EditText):Boolean{
        var areCorrect = false
        try{
            var num1 = n1.text.toString().toInt()
            var num2 = n2.text.toString().toInt()
            areCorrect = true
        }catch(e:Exception){
            Log.e("Sergio","${e}")
        }
        return areCorrect
    }


//Esto es un test para actualizar la clonación del repositorio local entre diferentes equipos




}