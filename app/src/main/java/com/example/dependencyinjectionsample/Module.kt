package com.example.dependencyinjectionsample

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

class Dummy(private val name :String) {
}

@Module
@InstallIn(ActivityComponent::class)
object AnalyticsModule {

    @Provides
    fun provideAnalyticsService(
        // Potential dependencies of this type
    ): Dummy {
        return Dummy("챌린지반")
    }

}
