package ac.id.utdi.kartunama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //        menghilangkan header pada saat aplikasi ditampilkan
        supportActionBar?.hide()

//        setting waktu SplashScreen saat di tampilkan selama 10 detik
        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 10000)
    }
}