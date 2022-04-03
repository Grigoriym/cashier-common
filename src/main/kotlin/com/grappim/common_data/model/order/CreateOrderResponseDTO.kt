package com.grappim.data_service.model.order

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CreateOrderResponseDTO(
  @SerialName("id")
  val id: Long
)
