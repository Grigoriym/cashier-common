package com.grappim.common_data.model.order

import com.grappim.common_data.serializer.BigDecimalSerializer
import com.grappim.common_data.serializer.UUIDSerializer
import com.grappim.data_service.model.order.OrderItemDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.math.BigDecimal
import java.util.*

@Serializable
data class CreateOrderDTO(
    @SerialName("merchantId")
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    @SerialName("stockId")
    @Serializable(UUIDSerializer::class)
    val stockId: UUID,
    @SerialName("cashBoxId")
    @Serializable(UUIDSerializer::class)
    val cashBoxId: UUID,
    @SerialName("totalSum")
    @Serializable(BigDecimalSerializer::class)
    val totalSum: BigDecimal,
    @SerialName("payType")
    val payType: String,
    @SerialName("orderItems")
    val orderItems: List<OrderItemDTO>
)