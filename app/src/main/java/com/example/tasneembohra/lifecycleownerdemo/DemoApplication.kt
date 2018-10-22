package com.example.tasneembohra.lifecycleownerdemo

import android.app.Application
import android.arch.lifecycle.ProcessLifecycleOwner

class DemoApplication: Application() {
    private lateinit var appObserver: AppStateObserver

    override fun onCreate() {
        super.onCreate()

        ProcessLifecycleOwner.get()
                .lifecycle
                .addObserver(AppStateObserver().also { appObserver = it })
    }
}