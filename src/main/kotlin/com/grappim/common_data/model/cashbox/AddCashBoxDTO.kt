package com.grappim.common_data.model.cashbox

import com.grappim.common_data.serializer.UUIDSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class AddCashBoxDTO(
    @SerialName("name")
    val name: String,
    @SerialName("merchantId")
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    @SerialName("stockId")
    @Serializable(UUIDSerializer::class)
    val stockId: UUID
)
