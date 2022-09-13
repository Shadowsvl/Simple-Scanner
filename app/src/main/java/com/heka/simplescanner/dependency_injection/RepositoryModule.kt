package com.heka.simplescanner.dependency_injection

import com.heka.simplescanner.data.repository.scan.ScanRepository
import com.heka.simplescanner.data.repository.scan.impl.ScanRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @ViewModelScoped
    abstract fun bindsScanRepository(
        scanRepositoryImpl: ScanRepositoryImpl
    ): ScanRepository

}