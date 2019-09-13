package com.leo.problem.integertoroman

import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow


    fun intToRoman(num: Int): String {
        val romanRep = romanRepresentation()

        if(num < 0 || num > 3999) {
            return ""
        }
        val numSize = (floor(log10(num.toDouble())) +1).toInt()
        var counter = numSize
        var res = StringBuilder()
        var number = num

        while(counter > 0) {
            var exp = 10.0.pow((counter -1)).toInt()
            res.append(romanRep[(number / exp) * exp])
            number %= exp
            counter--
        }
        return res.toString()
    }


    fun romanRepresentation():Map<Int,String> {
        return mapOf(
            0 to "",
            1 to "I",
            2 to "II",
            3 to "III",
            4 to "IV",
            5 to "V",
            6 to "VI",
            7 to "VII",
            8 to "VIII",
            9 to "IX",
            10 to "X",
            20 to "XX",
            30 to "XXX",
            40 to "XL",
            50 to "L",
            60 to "LX",
            70 to "LXX",
            80 to "LXXX",
            90 to "XC",
            100 to "C",
            200 to "CC",
            300 to "CCC",
            400 to "CD",
            500 to "D",
            600 to "DC",
            700 to "DCC",
            800 to "DCCC",
            900 to "CM",
            1000 to "M",
            2000 to "MM",
            3000 to "MMM"
        )
    }

fun main() {
    print(intToRoman(10))
}