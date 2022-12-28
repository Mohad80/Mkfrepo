@file:Suppress("ControlFlowWithEmptyBody")

package co.mkf80.newtest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            btn1.setOnClickListener {
                if (edit1.text.isEmpty()) {
                    Toast.makeText(this, "لطفا مبلغ را مشخص کنید", Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
                if (!radio1.isChecked && !radio2.isChecked && !radio3.isChecked && !radio4.isChecked
                    && !radio5.isChecked && !radio6.isChecked) {
                    Toast.makeText(this, "لطفا درصد را مشخص کنید",Toast.LENGTH_LONG).show()
                    return@setOnClickListener
                }
                val price = edit1.text.toString().toInt()
                var reso = 0
                if (radio1.isChecked)
                    reso = price * 10 / 100
                else if (radio5.isChecked)
                    reso = price * 6 / 100
                else if (radio2.isChecked)
                    reso = (price * 12 / 100) * 2
                else if (radio3.isChecked)
                    reso = (price * 16 / 100) * 12
                else if (radio4.isChecked)
                    reso = (price * 18 / 100) * 24
                else if (radio6.isChecked)
                    reso = (price * 25 / 100) * 36
                Toast.makeText(this, reso.toString(), Toast.LENGTH_LONG).show()
            }
        }
    }