package fishtastic.com

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import fishtastic.com.DisplayHand
import fishtastic.com.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import fishtastic.com.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import fishtastic.com.ui.theme.GoFishTheme
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thread = Thread {
            try {
                sleep(5000)
            } catch (e: Exception) {
                e.printStackTrace()
            } finally {
                val displHandIntent = Intent(this@MainActivity, DisplayHand::class.java)
                startActivity(displHandIntent)
            }
        }
        thread.start()
    }

    override fun onPause() {
        super.onPause()
        finish()
    }


    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        GoFishTheme {
            Greeting("Android")
        }
    }
}

/*import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.view.View

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.startGame)

        button.setOnClickListener {
            DisplayHand()
        }
    }

    private fun DisplayHand() {
        val intent = Intent(this, DisplayHand::class.java)
        startActivity(intent)
    }
}*/

