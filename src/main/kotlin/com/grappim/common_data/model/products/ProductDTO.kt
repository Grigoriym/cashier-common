package com.grappim.common_data.model.products

import com.grappim.common_data.serializer.BigDecimalSerializer
import com.grappim.common_data.serializer.LocalDateTimeSerializer
import com.grappim.common_data.serializer.UUIDSerializer
import com.grappim.common_data.ProductUnitDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.*

@Serializable
data class ProductDTO(
    val id: Long,
    val barcode: String,
    val name: String,
    @Serializable(with = UUIDSerializer::class)
    val stockId: UUID,
    @Serializable(with = BigDecimalSerializer::class)
    val amount: BigDecimal,
    val unit: ProductUnitDTO,
    @Serializable(with = UUIDSerializer::class)
    val merchantId: UUID,
    @Serializable(with = BigDecimalSerializer::class)
    val purchasePrice: BigDecimal,
    @Serializable(with = BigDecimalSerializer::class)
    val sellingPrice: BigDecimal,
    @Serializable(with = LocalDateTimeSerializer::class)
    val createdOn: LocalDateTime,
    @Serializable(with = LocalDateTimeSerializer::class)
    val updatedOn: LocalDateTime,
    val categoryId: Long
)

@Serializable
data class UpdateProductRequestDTO(
    val product: ProductDTO
)

@Serializable
data class CreateProductRequestDTO(
    val product: CreateProductDTO
)

@Serializable
data class CreateProductResponseDTO(
    @SerialName("product")
    val product: ProductDTO
)

@Serializable
data class CreateProductDTO(
    val name: String,
    @Serializable(UUIDSerializer::class)
    val stockId: UUID,
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    val unit: String,
    @Serializable(with = BigDecimalSerializer::class)
    val purchasePrice: BigDecimal,
    @Serializable(with = BigDecimalSerializer::class)
    val sellingPrice: BigDecimal,
    @Serializable(with = BigDecimalSerializer::class)
    val amount: BigDecimal,
    val barcode: String,
    val categoryId: Long
)