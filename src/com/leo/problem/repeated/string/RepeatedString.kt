package com.leo.problem.repeated.string


//Problem
// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup


fun repeatedString(s: String, n: Long): Long {

    var counter: Long = 0
    val times = n / s.length
    return if(s.contains('a')) {
        for(char in s) {
            if(char =='a') {
                counter += 1
            }
        }
        val complement = n - (s.length * times)
        if(s.length%2 ==1) (counter * times) + complement else (counter * times)
    }else {
        0
    }
}

fun main() {
    print(repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq",549382313570))
}