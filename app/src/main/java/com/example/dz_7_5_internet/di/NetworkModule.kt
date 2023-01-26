package com.example.dz_7_5_internet.di

import com.example.dz_7_5_internet.data.remote.RetrofitClient
import com.example.dz_7_5_internet.data.remote.api.PostsApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient = RetrofitClient()

    @Provides
    @Singleton
    fun providePostApiService(): PostsApiService {
        return retrofitClient.postsApiService
    }
}