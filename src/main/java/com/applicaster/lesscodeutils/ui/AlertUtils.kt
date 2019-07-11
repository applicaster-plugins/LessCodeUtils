package com.applicaster.lesscodeutils.ui

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import com.applicaster.lesscodeutils.R

class AlertUtils {
    companion object {
        fun showAlertDialog(context: Context, title: String, message: String,
                            positiveBtnText: String, listener: DialogInterface.OnClickListener) {
            getAlertDialog(context, title, message, positiveBtnText, listener).show()
        }

        fun getAlertDialog(context: Context, title: String, message: String,
                           positiveBtnText: String)
                : AlertDialog {
            return getAlertDialog(context, title, message, positiveBtnText,
                    DialogInterface.OnClickListener { dialogInterface, _ -> dialogInterface.dismiss() })
        }

        fun getAlertDialog(context: Context, title: String, message: String,
                           positiveBtnText: String, listener: DialogInterface.OnClickListener)
                : AlertDialog {
            val builder = AlertDialog.Builder(context, R.style.AlertDialogCustom)
            builder.setTitle(title)
            builder.setMessage(message)
            builder.setPositiveButton(positiveBtnText, listener)

            return builder.create()
        }
    }
}

