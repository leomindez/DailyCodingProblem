package com.leo.problem.longest.string

import kotlin.math.max
//https://leetcode.com/problems/longest-substring-without-repeating-characters/
fun lengthOfLongestSubstring(s: String): Int {
    val n = s.length
    var ans = 0
    val map = mutableMapOf<Char,Int>() // current index of character
    // try to extend the range [i, j]
    var j = 0
    var i = 0
    while (j < n) {
        if (map.containsKey(s[j])) {
            i = max(map.getOrDefault(s[j],0), i)
        }
        ans = max(ans, j - i + 1)
        map[s[j]] = j + 1
        j++
        println(map)
    }
    return ans
}
fun main() {
    val lols = lengthOfLongestSubstring("abcabcbb")
    print(lols)
}