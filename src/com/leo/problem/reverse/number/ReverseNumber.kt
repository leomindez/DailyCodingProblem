package com.leo.problem.reverse.number

import kotlin.math.pow

// https://leetcode.com/problems/reverse-integer/
fun reverse(x: Int): Int {
    var reverse = 0
    var x = x


    while(x!= 0) {
        var mod = x%10
        x /= 10

        if (reverse > 2.0.pow(31.0)) return 0;
        if (reverse < -(2.0.pow(31.0))) return 0;
        reverse = reverse * 10 + mod
    }
    return reverse
}

fun main() {
    println(reverse(1534236469))
}