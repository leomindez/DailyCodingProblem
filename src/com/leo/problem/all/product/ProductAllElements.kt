package com.leo.problem.all.product

//Given an array of integers, return a new array such that each element at index i of the new array
//is the product of all the numbers in the original array except the one at i.

//example
//input: [1,2,3,4,5]
//output: [120,60,40,30,24]

//example
//input [3,2,1]
//output [2,3,6]

fun allProductOf(elements: List<Int>):List<Int> {
    val products = mutableListOf<Int>()
    var product = 1
    elements.forEach{
        element ->
        product *= element
    }

    elements.forEach {
        element ->
        products.add(product/element)
    }
    return products
}

fun main() {
    print(allProductOf(listOf(3,2,1)))
}