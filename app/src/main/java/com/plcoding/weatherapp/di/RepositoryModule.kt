package com.plcoding.weatherapp.di

import com.plcoding.weatherapp.data.location.DefaultLocationTracker
import com.plcoding.weatherapp.data.repository.WeatherRepositoryImpl
import com.plcoding.weatherapp.domain.location.LocationTracker
import com.plcoding.weatherapp.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
@ExperimentalCoroutinesApi
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindeWeatherRepository(weatherRepositoryImpl: WeatherRepositoryImpl): WeatherRepository
}