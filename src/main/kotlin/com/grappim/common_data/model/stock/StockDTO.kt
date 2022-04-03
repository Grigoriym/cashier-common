package com.grappim.common_data.model.stock

import com.grappim.common_data.serializer.UUIDSerializer
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class StockDTO(
    @Serializable(UUIDSerializer::class)
    val id: UUID,
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    val name: String
)

@Serializable
data class StocksResponseDTO(
    val stocks: List<StockDTO>
)