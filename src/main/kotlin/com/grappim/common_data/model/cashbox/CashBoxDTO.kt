package com.grappim.common_data.model.cashbox

import com.grappim.common_data.serializer.UUIDSerializer
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class CashBoxDTO(
    val name: String,
    @Serializable(UUIDSerializer::class)
    val cashBoxId: UUID,
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    @Serializable(UUIDSerializer::class)
    val stockId: UUID
)

@Serializable
data class CashBoxResponseDTO(
    val cashBoxes: List<CashBoxDTO>
)

@Serializable
data class GetCashBoxesListDTO(
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    @Serializable(UUIDSerializer::class)
    val stockId: UUID
)