package com.example.dependencyinjectionsample

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.launch
import javax.inject.Inject

class PresentLogRepository @Inject constructor(
    private val dummy: Dummy
) {


    fun fetch() {
        // async1의 리턴값을 받아서
        // async234에게 전달한다
        // async234의 데이터를 취합해서 평균을 낸다
        GlobalScope.launch {
            val firstJob = async {
                return@async async1()
            }

            val parameter1 = firstJob.await()

            val deferreds = listOf(
                async { async2(parameter1) },
                async { async3(parameter1) },
                async { async4(parameter1)}
            )

            val result = deferreds.awaitAll() as List<Int>


            val average = result.map {

            }




        }


    }


    private fun async1() :String{
        return "hello"
    }
    private fun async2(p1: String) {}
    private fun async3(p1: String) {}
    private fun async4(p1: String) {}


}