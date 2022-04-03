package com.grappim.common_data

enum class ProductUnitDTO(
    val unit: String
) {
    KG("kg"),
    METRE("m"),
    LITRE("l"),
    PIECE("pc");

    companion object {
        fun getUnitFromString(text: String): ProductUnitDTO =
            when (text) {
                KG.unit -> KG
                METRE.unit -> METRE
                LITRE.unit -> LITRE
                PIECE.unit -> PIECE
                else -> error("incorrect product unit: $text")
            }
    }
}