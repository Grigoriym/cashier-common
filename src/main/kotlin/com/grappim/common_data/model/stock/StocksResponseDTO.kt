package com.grappim.common_data.model.stock

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StocksResponseDTO(
    @SerialName("stocks")
    val stocks: List<StockDTO>
)