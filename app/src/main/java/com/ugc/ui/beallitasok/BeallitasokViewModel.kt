package com.ugc.ui.beallitasok

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BeallitasokViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "AZTAKURVA SÖTÉTMÓD MITTOMÉN BEÁLLÍTÁSOK NA"
    }
    val text: LiveData<String> = _text
}