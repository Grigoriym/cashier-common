package com.grappim.common_data.model.waybill.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UpdateWaybillProductDTO(
    @SerialName("product")
    val product: PartialWaybillProductDTO
)