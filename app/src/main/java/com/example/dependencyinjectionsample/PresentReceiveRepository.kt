package com.example.dependencyinjectionsample

import javax.inject.Inject

class PresentReceiveRepository @Inject constructor(
    private val dummy: Dummy
) {


}