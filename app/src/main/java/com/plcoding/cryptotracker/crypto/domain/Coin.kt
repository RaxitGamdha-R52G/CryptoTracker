package com.plcoding.cryptotracker.crypto.domain

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapInr: Double,
    val priceInr: Double,
    val changePercent24Hrs: Double
)

