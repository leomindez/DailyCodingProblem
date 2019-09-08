package com.leo.problem.tiles


/***
 *
 *You have a set of tiles, where each tile has one letter tiles[i] printed on it.  Return the number of possible non-empty sequences of letters you can make.
 
Example 1:
Input: "AAB"
Output: 8
Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
Example 2:
Input: "AAABBC"
Output: 188
 
Note:
1. 1 <= tiles.length <= 7
2. tiles consists of uppercase English letters.
 */


fun numTilePossibilities(tiles: String): Int {
   var frec = mutableMapOf<Char,Int>()
    for(char in tiles) {
        val counter = frec.getOrDefault(char,0)
        frec[char] = counter + 1
    }
    return dfs(frec)
}


fun dfs(frec:MutableMap<Char,Int>):Int{
    var count = 0

   for(letter in frec) {
       if(letter.value > 0) {
           count +=1
           var value = frec.getValue(letter.key)
           frec[letter.key] = value - 1
           count += dfs(frec)
           frec[letter.key] = value
       }
    }
    return count
}
fun main() {
    print(numTilePossibilities("AAAB"))
}