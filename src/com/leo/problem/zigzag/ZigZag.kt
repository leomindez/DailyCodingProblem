package com.leo.problem.zigzag

import java.lang.StringBuilder

// https://leetcode.com/problems/zigzag-conversion/
fun convert(s: String, numRows: Int): String {

    val matrix = MutableList(numRows) { MutableList(s.length/2){'0'} }
    var col = 0
    var row = 0
    var index = 0
    val zigzag = StringBuilder()

    if (numRows == 1) {
        return s
    }

    while(index <= s.length-1) {

        if(row == -1) {
            row = 0
            col -=1
            index -=1
        }
       while(row < numRows) {
           if (index <= s.length - 1) {
               matrix[row++][col] = s[index++]
           } else {
               break
           }
       }

        if(row == numRows) {
            row -= 2
            col +=1
        }
        while (row >= 0) {
            if (index <= s.length - 1) {
                matrix[row--][col++] = s[index++]
            } else {
                break
            }
        }
    }


    matrix.forEach{element ->
        element.forEach{ letter -> if(letter != '0') zigzag.append(letter)}
    }
    return zigzag.toString()
}

fun main() {
    print(convert("PAYPALISHIRING",4))
}