package app.miki.mikiso.profiletextview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //コード上で、textViewのtextの中身を変える方法
        textView.text = "Sleepy" //""の中身を変えることで、好きなtextを表示できるぞ！！

        //コード上で、textViewの色を変更させる方法
        textView.setTextColor(Color.rgb(200,50,80)) //()の中の数字を変えることで、色を動的に変更できるぞ!!

    }
}