package com.grappim.common_data.model.waybill.product

import com.grappim.common_data.serializer.BigDecimalSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.math.BigDecimal

@Serializable
data class UpdateWaybillProductResponseDTO(
    @SerialName("totalCost")
    @Serializable(BigDecimalSerializer::class)
    val totalCost: BigDecimal
)
