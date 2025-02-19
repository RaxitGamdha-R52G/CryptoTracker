package com.plcoding.cryptotracker.crypto.data.networking.dto

import kotlinx.serialization.Serializable

@Serializable
data class CoinDto(
    val id:String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val priceInr: Double,
    val marketCapInr: Double,
    val changePercent24Hrs: Double
)
