package fishtastic.com

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayHand : AppCompatActivity() {
   lateinit var clubs2: ImageView
   lateinit var clubs3: ImageView

   lateinit var tv_computer: TextView
   lateinit var tv_player1: TextView

   lateinit var b_deal:Button
   lateinit var tv_fish: TextView


   var player1 = 0
    var player2 = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_hand)
    }
}