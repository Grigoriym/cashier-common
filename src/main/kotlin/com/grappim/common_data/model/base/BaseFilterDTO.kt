package com.grappim.common_data.model.base

import com.grappim.common_data.serializer.UUIDSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class BaseFilterDTO(
  @SerialName("limit")
  val limit: Int,
  @SerialName("offset")
  val offset: Long,
  @SerialName("merchantId")
  @Serializable(UUIDSerializer::class)
  val merchantId: UUID,
  @SerialName("stockId")
  @Serializable(UUIDSerializer::class)
  val stockId: UUID,
  @SerialName("query")
  val query: String? = null
)