package com.ugc.ui.videok

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VideokViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Videónézegetés, egyedi tartalmak, remélhetőleg sok fraktál :))"
    }
    val text: LiveData<String> = _text
}