package com.example.myapplication

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewmodel(): ViewModel() {

    var item: MutableLiveData<Int> = MutableLiveData<Int>()

    fun getSelected(): LiveData<Int> {
        return item
    }

    fun setItem(item: Int) {
        this.item.value = item
    }

}