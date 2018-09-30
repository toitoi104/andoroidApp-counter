package com.seana.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.btn_add)
        var reset = findViewById<Button>(R.id.btn_reset)
        var add_counter = findViewById<TextView>(R.id.add_counter)

        //追加
        button.setOnClickListener {
            count++
            var countTxt: String = Integer.toString(count)
            add_counter.text = countTxt
        }

        //リセット
        reset.setOnClickListener {
            count = 0
            add_counter.text = "0"
        }
    }
}
