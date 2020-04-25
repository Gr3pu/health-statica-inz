package eu.codetown.healthstatica

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import eu.codetown.healthstatica.login.LoginActivity

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.AppTheme)

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_splash)

        var defaultState = 0
        routeToAppropriatePage(defaultState)
        finish()
    }

    private fun routeToAppropriatePage(state: Int) {
        when(state) {
            0 -> {
                startActivity(Intent(applicationContext, LoginActivity::class.java))
                finish()
            }
            else -> throw Exception("nie działa splashscreen")
        }
    }

}