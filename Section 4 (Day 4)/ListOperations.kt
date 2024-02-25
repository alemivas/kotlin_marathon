package com.example.myapplication

fun main (){
    val fruitsList = mutableListOf("banana", "orange", "apple", "grapefruit", "plum")

    println("\noriginal list:")
    for (fruit in fruitsList){
        print("$fruit ")
    }
    println()

    fruitsList.add(2,"cherry")
    println("\nadd element in list:")
    for (fruit in fruitsList){
        print("$fruit ")
    }
    println()

    fruitsList.remove("grapefruit")
    println("\nremove element from list:")
    for (fruit in fruitsList){
        print("$fruit ")
    }
    println()

    println()
    val fruitForSearch = "333apple"
    if (fruitsList.contains(fruitForSearch)){
        println("$fruitForSearch exist in list")
    }else{
        println("$fruitForSearch is not exist in list")
    }

}