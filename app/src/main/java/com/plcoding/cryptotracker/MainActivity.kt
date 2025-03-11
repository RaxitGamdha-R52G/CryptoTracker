package com.plcoding.cryptotracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.plcoding.cryptotracker.core.navigation.AdaptiveCOinListDetailPane
import com.plcoding.cryptotracker.ui.theme.CryptoTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CryptoTrackerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    val viewModel = koinViewModel<CoinListViewModel>()
//                    val state by viewModel.state.collectAsStateWithLifecycle()
//
//                    when {
//                        state.selectedCoin != null -> {
//                            CoinDetailScreen(
//                                state = state,
//                                modifier = Modifier.padding(innerPadding)
//                            )
//                        }
//
//                        else -> {
//                            CoinListScreen(
//                                state = state,
//                                modifier = Modifier.padding(innerPadding),
//                                onAction = viewModel::onAction
//                            )
//                        }
//                    }
                    AdaptiveCOinListDetailPane(
                        modifier = Modifier.padding(innerPadding),
                    )
                }
            }
        }
    }
}
