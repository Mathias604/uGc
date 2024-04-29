package com.ugc.ui.zenelejatszo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ZenelejatszoViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Itt lehet testreszabni az alkalmazás működését és támogatni a fejlesztőket"
    }
    val text: LiveData<String> = _text
}