package com.grappim.data_service.model.order

import com.grappim.common_data.model.order.CreateOrderDTO
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CreateOrderRequestDTO(
  @SerialName("order")
  val order: CreateOrderDTO
)