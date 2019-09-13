package com.leo.problem.stringtointeger

import kotlin.math.pow
fun myAtoi(str: String): Int {
    val numericalString = getNumericalString(str)
    if(numericalString.isNotBlank() || numericalString.isNotEmpty()) {
        return fromStringToNumber(numericalString)
    }
    return 0
}

fun getNumericalString(str: String):String {

    val bufferString = StringBuffer()

    if(str.isEmpty()) {
        return ""
    }

    if(str[0].isLetter()) {
        return ""
    }

    for(index in str.indices) {

        if((!str[index].isDigit() && str[index] != '-'  && str[index] != '+') && str[index].toInt() != 32) {
            if(bufferString.toString().isNotEmpty()) {
                return bufferString.toString()
            }else {
                return ""
            }
        }

        if(str[index] == '-') {
            bufferString.append(str[index])
        }

        if(str[index] == '+') {
            bufferString.append(str[index])
        }
        if(bufferString.isEmpty() && str[index] == '0') {
            continue
        }

        if(bufferString.isEmpty() && str[index].isDigit() && str[index]!= '0') {
            bufferString.append(str[index])
            continue
        }

        if(bufferString.isNotEmpty() && str[index].isDigit() && str[index] == '0') {
            bufferString.append(str[index])
        }

        if(bufferString.isNotEmpty() && str[index].isDigit()) {
            bufferString.append(str[index])
        }


    }
    return bufferString.toString()
}

fun fromStringToNumber(str: String):Int {
    var numberSize = str.length - 1
    var isNegative = false
    var startedIndex = 0
    var res = 0
    if(str[0] == '-') {
        numberSize -= 1
        isNegative = true
        startedIndex = 1
    }

    if(str[0] == '+') {
        numberSize -= 1
        startedIndex = 1
    }

    for(index in startedIndex until str.length) {

        val exponent = 10.0.pow(numberSize).toInt()

        if(exponent == Integer.MAX_VALUE && isNegative) {
            return Int.MIN_VALUE
        }
        if(exponent == Integer.MAX_VALUE) {
            return Int.MAX_VALUE
        }

        res += Character.getNumericValue(str[index]) * exponent
        numberSize -=1
    }

    if(isNegative) {
        res *= -1
    }

    return res
}

fun main() {
    print(myAtoi("-000000000000001"))
}