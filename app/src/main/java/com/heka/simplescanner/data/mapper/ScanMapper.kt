package com.heka.simplescanner.data.mapper

import com.google.mlkit.vision.barcode.common.Barcode
import com.heka.simplescanner.model.Scan
import com.heka.simplescanner.model.ScanType

fun Barcode.toScan(): Scan {
    return Scan(
        rawScanValue = rawValue ?: "",
        scanType = if (format == Barcode.FORMAT_QR_CODE) ScanType.QR else ScanType.Barcode
    )
}