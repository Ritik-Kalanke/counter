package com.example.countermvvm.ui.theme

data class CounterModel (var count: Int)
class CounterRepo(){
    private var counter = CounterModel(0)
    fun getCounter() = counter

    fun increment(){
        counter.count++
    }

    fun decrement(){
        counter.count--
    }
}