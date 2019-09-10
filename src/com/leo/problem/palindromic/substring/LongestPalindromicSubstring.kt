package com.leo.problem.palindromic.substring

// Problem
// https://leetcode.com/problems/longest-palindromic-substring/

fun longestPalindrome(s: String): String {
    for(index in s.indices) {
        for(indexTwo in s.length-1 downTo index+1) {
            if(s[index] == s[indexTwo]) {
                if(checkPalindromicSubstring(s.substring(index,indexTwo+1))){
                    return s.substring(index,indexTwo+1)
                }else {
                    continue
                }
            }
        }
    }
    return "No palindromic substring"
}

fun checkPalindromicSubstring(substring:String): Boolean{
    var index = 0
    var reverseIndex = substring.length - 1
    var counter = 0
    var isPalindromic = true
    while(counter < (substring.length-1)/2) {
        isPalindromic = if(substring[index] == substring[reverseIndex]) {
            counter++
            index++
            reverseIndex--
            true
        }else {
            counter++
            index++
            reverseIndex--
            false
        }
    }
    return isPalindromic
}

fun main() {
    var longest = longestPalindrome("abcda")
    println(longest)
}
