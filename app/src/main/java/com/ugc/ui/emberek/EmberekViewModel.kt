package com.ugc.ui.emberek

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EmberekViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Muszáj leszek egy profil rendszert is csinálni majd meglássuk ezt még"
    }
    val text: LiveData<String> = _text
}