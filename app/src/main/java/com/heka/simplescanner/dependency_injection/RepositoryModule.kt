package com.heka.simplescanner.dependency_injection

import com.heka.simplescanner.data.repository.scan.ScanRepository
import com.heka.simplescanner.data.repository.scan.impl.ScanRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindsScanRepository(
        scanRepositoryImpl: ScanRepositoryImpl
    ): ScanRepository

}