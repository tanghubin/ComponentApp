package com.module.test

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import com.base.lib.Constant
import kotlinx.android.synthetic.main.ac_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_login)
        bt_jump.setOnClickListener {
            val targetClass = intent.getStringExtra(Constant.TARGET_CLASS)
            if (!TextUtils.isEmpty(targetClass)) {
                var intent = Intent()
                intent.setClassName(this@LoginActivity, targetClass)
                startActivity(intent)
            }
        }
    }
}
