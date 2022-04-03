package com.grappim.common_data.model.product_category

import com.grappim.common_data.serializer.LocalDateTimeSerializer
import com.grappim.common_data.serializer.UUIDSerializer
import kotlinx.serialization.Serializable
import java.time.LocalDateTime
import java.util.*

@Serializable
data class ProductCategoryDTO(
    val id: Long,
    val name: String,
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    @Serializable(UUIDSerializer::class)
    val stockId: UUID,
    @Serializable(with = LocalDateTimeSerializer::class)
    val updatedOn: LocalDateTime,
    @Serializable(with = LocalDateTimeSerializer::class)
    val createdOn: LocalDateTime
)

@Serializable
data class CreateProductCategoryRequestDTO(
    val category: CreateProductCategoryDTO
)

@Serializable
data class CreateProductCategoryDTO(
    val name: String,
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    @Serializable(UUIDSerializer::class)
    val stockId: UUID
)