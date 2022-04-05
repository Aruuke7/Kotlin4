package kg.geektech.kotlin4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {
    private var mCounter = 0

    val storyLiveData = MutableLiveData<ArrayList<String>>()
    val counter = MutableLiveData<Int>()
    private val list = arrayListOf<String>()

    fun onIncrementClick() {
        mCounter++
        counter.value = mCounter
        list.add("+ \n")
        storyLiveData.value = list
    }

    fun onDecrementClick() {
        mCounter++
        counter.value = mCounter
        list.add("- \n")
        storyLiveData.value = list
    }
}