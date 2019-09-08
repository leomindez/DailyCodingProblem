package com.leo.problem.median.two.arrays

//https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/
fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {


    val newList = arrayListOf(nums1.toList(),nums2.toList()).flatten().sorted()
    print(newList)
    return if(newList.size % 2 == 1) {
        newList[newList.size/2].toDouble()
    }else {
        ((newList[(newList.size/2)-1] + newList[newList.size/2]) / 2.0)
    }
}

fun main() {
    val fms = findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4))
    print(fms)
}