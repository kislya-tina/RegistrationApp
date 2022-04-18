package me.apps.registrationapp;

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import me.apps.registrationapp.R

class MainActivity : AppCompatActivity() {

    private var user_fieldName: EditText? = null
    private var user_fieldPass: EditText? = null
    private var main_butt: Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user_fieldName = findViewById(R.id.username)
        user_fieldPass = findViewById(R.id.pass)
        main_butt = findViewById(R.id.button)

        main_butt?.setOnClickListener{
            if(user_fieldName?.text?.toString()?.trim()?.equals("")!! || user_fieldPass?.text?.toString()?.trim()?.equals("")!!){
                Toast.makeText(this, "Please enter ID and/or password", Toast.LENGTH_LONG).show()
            }else{
                val name: String = user_fieldName?.text.toString()
                val password: String = user_fieldPass?.text.toString()
                if(name != "0001" || password !="0000"){
                    Toast.makeText(this, "Incorrect ID and/or password", Toast.LENGTH_LONG).show()
                }else {
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }




    fun onClickLogIn(view: View){
        val name: String = user_fieldName?.text.toString()
        val password: String = user_fieldPass?.text.toString()

        if(name == "01" && password == "00") {
            //val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }


}