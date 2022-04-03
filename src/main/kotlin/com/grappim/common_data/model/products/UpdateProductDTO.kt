package com.grappim.common_data.model.products

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UpdateProductDTO(
    @SerialName("product")
    val product: ProductDTO
)