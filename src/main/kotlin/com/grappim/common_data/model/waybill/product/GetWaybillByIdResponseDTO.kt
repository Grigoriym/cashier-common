package com.grappim.common_data.model.waybill.product

import com.grappim.common_data.model.waybill.WaybillDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetWaybillByIdResponseDTO(
    @SerialName("waybill")
    val waybill: WaybillDTO
)
