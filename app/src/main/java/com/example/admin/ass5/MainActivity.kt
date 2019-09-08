package com.example.admin.ass5

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClickShowDetail(v: View){
        var radioGroup: RadioGroup = findViewById(R.id.radio_gd)
        var selectedId: Int = radioGroup.checkedRadioButtonId;
        var radioButton: RadioButton = findViewById(selectedId);
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("EmpData",Employee(edit_name.text.toString(),radioButton.text.toString(),
            edit_em.text.toString(),salary_em.text.toString().toInt()))
        startActivity(intent)
    }
    fun reset(v: View){
        edit_name.text.clear()
        radio_gd.clearCheck()
        edit_em.text.clear()
        salary_em.text.clear()
    }
}
