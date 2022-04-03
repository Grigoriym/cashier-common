package com.grappim.common_data.model.basket

import com.grappim.common_data.serializer.BigDecimalSerializer
import com.grappim.common_data.serializer.UUIDSerializer
import com.grappim.common_domain.model.ProductUnit
import kotlinx.serialization.Serializable
import java.math.BigDecimal
import java.util.*

@Serializable
data class BasketProductDTO(
    val id: Long,
    val barcode: String,
    val name: String,
    val productId: Long,
    @Serializable(UUIDSerializer::class)
    val stockId: UUID,
    @Serializable(UUIDSerializer::class)
    val merchantId: UUID,
    @Serializable(BigDecimalSerializer::class)
    val amount: BigDecimal,
    val unit: ProductUnit,
    @Serializable(BigDecimalSerializer::class)
    val sellingPrice: BigDecimal,
    val basketId: Long
)
