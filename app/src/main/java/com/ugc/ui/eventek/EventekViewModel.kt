package com.ugc.ui.eventek

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EventekViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Eventek keresése, készítése, szűrése, tervezése, promózása, MINDEN MERT AZ FB SZAR"
    }
    val text: LiveData<String> = _text
}