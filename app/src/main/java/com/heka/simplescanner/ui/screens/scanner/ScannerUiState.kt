package com.heka.simplescanner.ui.screens.scanner

import androidx.camera.view.PreviewView

data class ScannerUiState(
    val previewView: PreviewView? = null,
    val scanText: String = "",
    val showBottomSheet: Boolean = false,
    val showCameraRequiredDialog: Boolean = false
)
