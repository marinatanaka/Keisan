package jp.techacademy.marina.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.renderscript.Sampler
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.reflect.KParameter


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this) }

        override fun onClick(v: View) {
            val intent = Intent(this, SecondcalcActivity:: class.java)
            intent.putExtra("VALUE",0)
            var num1:Double = editText1.text.toString().toDouble()
            var num2:Double = editText2.text.toString().toDouble()

            var VALUE1: Double =1.0
            var VALUE :Double = VALUE1


            try {

            if(v.id == R.id.button1) {
                VALUE1= num1 + num2
            }else if (v.id == R.id.button2){
                VALUE1 = num1 - num2
            }else if (v.id == R.id.button3) {
                VALUE1 = num1 * num2
            }else{
                VALUE1 = num1 / num2
            }

            startActivity(intent) }

            catch (e:Exception){
                startActivity(intent)
            }
    }


}
