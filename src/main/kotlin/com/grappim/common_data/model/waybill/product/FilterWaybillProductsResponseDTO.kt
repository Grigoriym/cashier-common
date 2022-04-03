package com.grappim.common_data.model.waybill.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class FilterWaybillProductsResponseDTO(
    @SerialName("products")
    val products: List<WaybillProductDTO>
) {
    companion object {
        fun empty(): FilterWaybillProductsResponseDTO =
            FilterWaybillProductsResponseDTO(
                emptyList()
            )
    }
}
