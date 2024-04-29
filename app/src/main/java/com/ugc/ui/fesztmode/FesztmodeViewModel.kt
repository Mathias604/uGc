package com.ugc.ui.fesztmode

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FesztmodeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Vegyes érzelmeim vannak ezzel a funkcióval kapcsolatban xD"
    }
    val text: LiveData<String> = _text
}