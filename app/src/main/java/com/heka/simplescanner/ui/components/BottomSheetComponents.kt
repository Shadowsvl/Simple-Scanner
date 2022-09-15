package com.heka.simplescanner.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.heka.simplescanner.R
import com.heka.simplescanner.data.fake.fakeScan
import com.heka.simplescanner.model.Scan
import com.heka.simplescanner.model.ScanType
import com.heka.simplescanner.ui.theme.BaseDP
import com.heka.simplescanner.ui.theme.ElevationDP
import com.heka.simplescanner.ui.theme.SimpleScannerTheme
import com.heka.simplescanner.ui.theme.SpaceDP

@Composable
fun ScanSheet(
    scan: Scan,
    onShareClicked: () -> Unit,
    onCopyClicked: () -> Unit,
    onWebClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(BaseDP),
        modifier = modifier
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_bottom_handle),
            contentDescription = null,
            tint = Color.LightGray,
            modifier = Modifier
                .padding(top = SpaceDP)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(id = scan.scanFormatId),
            style = MaterialTheme.typography.h6,
            fontWeight = FontWeight.Bold
        )
        if (scan.displayValue.isNotBlank()) {
            Surface(
                shape = MaterialTheme.shapes.medium,
                elevation = ElevationDP,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = scan.displayValue,
                    style = MaterialTheme.typography.body1,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(SpaceDP)
                )
            }
        }
        Divider()
        Row(
            horizontalArrangement = Arrangement.spacedBy(BaseDP, Alignment.End),
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            FloatingActionButton(
                onClick = onShareClicked,
                contentColor = Color.White,
                modifier = Modifier.requiredSize(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Share,
                    contentDescription = null
                )
            }
            FloatingActionButton(
                onClick = onCopyClicked,
                contentColor = Color.White,
                modifier = Modifier.requiredSize(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.ContentCopy,
                    contentDescription = null
                )
            }
            if (scan.scanType == ScanType.Url) {
                ExtendedFloatingActionButton(
                    contentColor = Color.White,
                    icon = {
                        Icon(
                            imageVector = Icons.Default.Public,
                            contentDescription = null
                        )
                    },
                    text = {
                        Text(
                            text = stringResource(id = R.string.scan_sheet_web_action),
                            style = MaterialTheme.typography.body1,
                            fontWeight = FontWeight.SemiBold
                        )
                    },
                    onClick = onWebClicked
                )
            }
        }
        Spacer(modifier = Modifier.height(2.dp))
    }
}

@Preview("Scan sheet", showBackground = true)
@Composable
private fun ScanSheetPreview() {
    SimpleScannerTheme {
        ScanSheet(
            scan = fakeScan.copy( scanType = ScanType.Url ),
            onShareClicked = {},
            onCopyClicked = {},
            onWebClicked = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = BaseDP)
        )
    }
}