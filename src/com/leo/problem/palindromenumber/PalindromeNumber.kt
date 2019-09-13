package com.leo.problem.palindromenumber

import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

fun isPalindrome(x: Int): Boolean {
    if( x < 0) {
        return false
    }

    val numDigits = floor(log10(x.toDouble()) + 1).toInt()
    var divider = 10.0.pow(numDigits-1)
    var x = x

    for (index in 0..numDigits/2) {
        if((x/divider).toInt() != (x %10)) {
            return false
        }
        x = (x % divider).toInt()
        x /= 10
        divider /= 100
    }
    return true
}

fun main() {
    print(isPalindrome(157751))
}