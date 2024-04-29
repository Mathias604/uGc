package com.ugc.ui.bolt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BoltViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "VEGYETEK KÉZMŰVES PORTÉKÁKAT A SOK KÉZMŰVESTŐL!!"
    }
    val text: LiveData<String> = _text
}