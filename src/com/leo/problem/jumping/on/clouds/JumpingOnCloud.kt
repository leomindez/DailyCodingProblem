package com.leo.problem.jumping.on.clouds

fun jumpingOnClouds(c: Array<Int>): Int {
    var index = 0
    var jumps = 0
    while(index != c.size-1){
        if((c.size-1) - index == 1){
           jumps += 1
            break
        }
     val jumpingOne = index + 1
     val jumpingTwo = index + 2

        when {
            (c[jumpingOne] == 0) and (c[jumpingTwo] == 1) ->
            { index = jumpingOne
                jumps += 1
            }
            (c[jumpingOne] == 1) and (c[jumpingTwo] == 0) -> {
                index = jumpingTwo
                jumps += 1
            }
            (c[jumpingOne] == 0) and (c[jumpingTwo] == 0) -> {
                index = jumpingTwo
                jumps += 1
            }
        }
    }
    return jumps
}

fun main() {
    print(jumpingOnClouds(arrayOf(0,0,1,1,0,0)))
}