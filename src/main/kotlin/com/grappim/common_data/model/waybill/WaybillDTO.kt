package com.grappim.common_data.model.waybill

import com.grappim.common_data.serializer.BigDecimalSerializer
import com.grappim.common_data.serializer.LocalDateTimeSerializer
import com.grappim.common_data.serializer.UUIDSerializer
import com.grappim.common_domain.model.WaybillStatus
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*

@Serializable
data class WaybillDTO(
    @SerialName("id")
    val id: Long,
    @SerialName("merchantId")
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    @SerialName("number")
    val number: String,
    @SerialName("stockId")
    @Serializable(UUIDSerializer::class)
    val stockId: UUID,
    @SerialName("createdOn")
    @Serializable(LocalDateTimeSerializer::class)
    val createdOn: LocalDateTime,
    @SerialName("updatedOn")
    @Serializable(LocalDateTimeSerializer::class)
    val updatedOn: LocalDateTime,
    @SerialName("totalCost")
    @Serializable(BigDecimalSerializer::class)
    val totalCost: BigDecimal,
    @SerialName("status")
    val status: WaybillStatus,
    @SerialName("comment")
    val comment: String,
    @SerialName("reservedTime")
    @Serializable(LocalDateTimeSerializer::class)
    val reservedTime: LocalDateTime? = null
)
