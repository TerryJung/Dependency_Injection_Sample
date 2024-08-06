package com.example.dependencyinjectionsample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class DIApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        // API 데이터를 들고온다거나
        // DB초기화를 여기서 할수 있음
    }
}