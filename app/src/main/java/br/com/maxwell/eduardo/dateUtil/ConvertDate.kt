package br.com.maxwell.eduardo.dateUtil

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun convertDateByPattern(pattern: String) : String {

    var currentDate: String = ""
    val simpleDateFormat = SimpleDateFormat(pattern, Locale("PT"))
    currentDate = simpleDateFormat.format(Date())
    return currentDate
}
