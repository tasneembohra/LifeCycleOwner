package com.example.tasneembohra.lifecycleownerdemo

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.util.Log

class AppStateObserver: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onForeground() {
        Log.d("AppStateObserver", "onForeground")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onBackground() {
            Log.d("AppStateObserver", "onBackground")
    }

}