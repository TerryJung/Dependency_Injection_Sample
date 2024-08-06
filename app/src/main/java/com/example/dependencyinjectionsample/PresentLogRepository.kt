package com.example.dependencyinjectionsample

import javax.inject.Inject

class PresentLogRepository @Inject constructor(
    private val dummy: Dummy
) {


}