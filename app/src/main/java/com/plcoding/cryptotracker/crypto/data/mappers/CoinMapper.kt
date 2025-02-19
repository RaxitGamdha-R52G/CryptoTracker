package com.plcoding.cryptotracker.crypto.data.mappers

import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinDto
import com.plcoding.cryptotracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        name = name,
        rank = rank,
        symbol =  symbol,
        marketCapInr = marketCapInr,
        priceInr =  priceInr,
        changePercent24Hrs =  changePercent24Hrs
    )
}