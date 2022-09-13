package com.heka.simplescanner.model

data class Scan(
    val rawScanValue: String,
    val scanType: ScanType
)

enum class ScanType {
    QR,
    Barcode
}
