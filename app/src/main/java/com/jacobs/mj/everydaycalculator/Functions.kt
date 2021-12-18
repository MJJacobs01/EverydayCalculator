package com.jacobs.mj.everydaycalculator

class Functions {

    fun add(numberOne: String, numberTwo: String): String {
        return if(numberOne.toInt() < 2147483647 && numberTwo.toInt() <2147483647){
            (numberOne.toInt() + numberTwo.toInt()).toString()
        }else{
            "Number selected cannot be larger than 2147483647"
        }
    }

    fun minus(numberOne: String, numberTwo: String): String {
        return (numberOne.toInt() - numberTwo.toInt()).toString()
    }

    fun multiply(numberOne: String, numberTwo: String): String {
        return (numberOne.toInt() * numberTwo.toInt()).toString()
    }

    fun divide(numberOne: String, numberTwo: String):String{
        return if (numberOne.toInt() != 0 && numberTwo.toInt() != 0){
            (numberOne.toInt() / numberTwo.toInt()).toString()
        } else{
            "Cannot divide by 0"
        }
    }
}