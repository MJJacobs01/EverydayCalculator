package com.jacobs.mj.everydaycalculator

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import net.objecthunter.exp4j.ExpressionBuilder

class UserInterfaceViewModel : ViewModel() {

    private val _expression = mutableStateOf("")
    val expression: State<String> = _expression

    private val _answer = mutableStateOf("")
    val answer: State<String> = _answer

    fun equals() {
        try {
            val result = ExpressionBuilder(expression.value).build().evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                _answer.value = longResult.toString()
            } else {
                _answer.value = result.toString()
            }
            _expression.value = ""
        } catch (e: Exception) {
            e.printStackTrace()
            Log.e("EXCEPTION:", "equals: ${e.message}")
        }
    }

    fun appendExpression(addedValue: String) {
        _expression.value = "${expression.value}$addedValue"
    }

    fun clearExpression() {
        _expression.value = ""
        _answer.value = ""
    }
}