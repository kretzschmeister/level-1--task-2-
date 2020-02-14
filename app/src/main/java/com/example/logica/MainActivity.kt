package com.example.logica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var amountCorrect: Int =0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener{answerCheck()}
    }
    private fun answerCheck(){
        //using equals to make case-insensitive
        if(et1.text.toString().equals("T",true)) amountCorrect +=1
        if(et2.text.toString().equals("F",true)) amountCorrect +=1
        if(et3.text.toString().equals("F",true)) amountCorrect +=1
        if(et4.text.toString().equals("F",true)) amountCorrect +=1
        Toast.makeText(this, getString(R.string.toastNumberAnswersCorrect)+ amountCorrect.toString(), Toast.LENGTH_LONG).show()
        amountCorrect = 0
    }
}
