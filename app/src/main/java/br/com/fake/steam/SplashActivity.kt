//Projeto: Produção de app
//Version: 1.01
//Autor: Rodrigo nascimento
//Data: 12/11/2018


package br.com.fake.steam

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        changeToLogin()
    }



    fun changeToLogin() {

        val intent = Intent(this, LoginActivity::class.java)

        Handler().postDelayed({
            intent.change()
        }, 2000)
    }

    fun Intent.change() {
        startActivity(this)
        finish()
    }
}
