package com.ugc.ui.kepek

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class KepekViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "SOK KÉP, SOK FRAKTÁL!!, Itt nem a csöcsökön van a hangsúly hanem hogy hogyan vizuzol!"
    }
    val text: LiveData<String> = _text
}