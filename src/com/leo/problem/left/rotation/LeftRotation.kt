package com.leo.problem.left.rotation

//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

fun rotLeft(a: Array<Int>, d: Int): Array<Int> {
    var counter = 1
    while(counter <= d) {
        var firstElement = a[0]
        for(index in 0 until a.size-1) {
            a[index] = a[index + 1]
        }
        a[a.size-1] = firstElement
        counter += 1
    }
    return a
}

fun main() {
    val result = rotLeft(arrayOf(33, 47,70,37,8,53,13,93,71,72,51,100,60,87,97), 13)
    println(result.joinToString(" "))
}