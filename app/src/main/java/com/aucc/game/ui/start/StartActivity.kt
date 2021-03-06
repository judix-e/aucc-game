package com.aucc.game.ui.start

import android.content.Intent
import android.os.Bundle
import com.aucc.game.ui.main.MainActivity
import dagger.android.support.DaggerAppCompatActivity

class StartActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
