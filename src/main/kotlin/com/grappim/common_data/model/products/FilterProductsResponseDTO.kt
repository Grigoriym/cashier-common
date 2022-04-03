package com.grappim.common_data.model.products

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FilterProductsResponseDTO(
    @SerialName("products")
    val products: List<ProductDTO>
) {
    companion object {
        fun empty(): FilterProductsResponseDTO = FilterProductsResponseDTO(emptyList())
    }
}
