package com.applicaster.lesscodeutils.date

import java.text.SimpleDateFormat
import java.util.*

class DateUtils {
    companion object {
        fun getCurrentDate(dateFormat: String): String {
            val date = Date()
            val simpleDateFormat = SimpleDateFormat(dateFormat, Locale.getDefault())
            return simpleDateFormat.format(date)
        }
    }
}
