package jp.techacademy.marina.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secondcalc.*


class SecondcalcActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondcalc)

        val value = intent.getDoubleExtra("VALUE", 3.4)

        resultOfCalc.text = value.toString()



    }
}
