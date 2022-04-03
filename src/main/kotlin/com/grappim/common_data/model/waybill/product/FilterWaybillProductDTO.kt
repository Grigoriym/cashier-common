package com.grappim.common_data.model.waybill.product

import kotlinx.serialization.Serializable

@Serializable
data class FilterWaybillProductDTO(
    val limit: Int,
    val offset: Long,
    val waybillId: Long
)