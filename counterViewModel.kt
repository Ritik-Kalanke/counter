package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel
import com.example.countermvvm.ui.theme.CounterRepo

class counterViewModel: ViewModel() {
    private var repo: CounterRepo = CounterRepo()
    private val _count = mutableIntStateOf(repo.getCounter().count)
    val count: MutableState<Int> = _count
    fun increment(){
        repo.increment()
        count.value++
    }
    fun decrement(){
        repo.decrement()
        if (count.value>0)
            count.value--
    }
 }