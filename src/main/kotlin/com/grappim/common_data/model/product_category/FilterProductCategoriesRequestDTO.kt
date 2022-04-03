package com.grappim.common_data.model.product_category

import com.grappim.common_data.serializer.UUIDSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class FilterProductCategoriesRequestDTO(
    @SerialName("limit")
    val limit: Int,
    @SerialName("offset")
    val offset: Long,
    @SerialName("merchantId")
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    @SerialName("stockId")
    @Serializable(UUIDSerializer::class)
    val stockId: UUID
)