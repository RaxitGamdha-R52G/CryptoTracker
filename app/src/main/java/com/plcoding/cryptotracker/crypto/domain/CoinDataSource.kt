package com.plcoding.cryptotracker.crypto.domain
import com.plcoding.cryptotracker.core.domain.util.NetworkError
import com.plcoding.cryptotracker.core.domain.util.Result
interface CoinDataSource {
    suspend fun getCoints(): Result<List<Coin>, NetworkError>
}