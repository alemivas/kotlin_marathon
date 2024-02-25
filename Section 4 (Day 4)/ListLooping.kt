package com.example.myapplication

fun main(){
    val numberList = mutableListOf(0,1,2,3,4)

    for (index in 0 until numberList.size){
        numberList[index] = numberList[index] * 2
        println(numberList[index])
    }
}