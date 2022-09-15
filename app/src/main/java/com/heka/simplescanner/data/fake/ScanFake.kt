package com.heka.simplescanner.data.fake

import com.heka.simplescanner.R
import com.heka.simplescanner.model.Scan
import com.heka.simplescanner.model.ScanType

val fakeScan = Scan(
    displayValue = "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.",
    scanFormatId = R.string.scan_format_qr_code,
    scanType = ScanType.Text
)