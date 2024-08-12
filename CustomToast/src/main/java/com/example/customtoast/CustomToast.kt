package com.example.customtoast

import android.content.Context
import android.view.View
import android.widget.TextView
import android.widget.Toast

object CustomToast {

    fun showCustomToast(context: Context, msg: String) {
        val toast = Toast(context)
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
    }

}