package com.grappim.common_data.model.feature_toggle

import com.grappim.common_data.serializer.UUIDSerializer
import kotlinx.serialization.Serializable
import java.util.*

@Serializable
data class FeatureToggleDTO(
  @Serializable(UUIDSerializer::class)
  val merchantId: UUID,
  @Serializable(UUIDSerializer::class)
  val stockId: UUID,
  val isWaybillEnabled: Boolean,
  val isSalesEnabled: Boolean
)