package com.ugc.ui.terkep

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TerkepViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Térképnézet elmenthető utakkal, és helyekkel."
    }
    val text: LiveData<String> = _text
}