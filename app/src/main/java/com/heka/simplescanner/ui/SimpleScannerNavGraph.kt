package com.heka.simplescanner.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.heka.simplescanner.ui.screens.scanner.ScannerScreen

object Routes {
    const val SCANNER = "scanner"
}

@Composable
fun SimpleScannerNavGraph(
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Routes.SCANNER
    ) {
       composable(route = Routes.SCANNER) {
           ScannerScreen()
       }
    }
}