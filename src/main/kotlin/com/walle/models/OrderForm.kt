package com.walle.models

import kotlinx.serialization.Serializable

@Serializable
class OrderForm(
    val chart: Chart,
    val customer_id: Int,
    val address_id: Int,
    val card_id: Int,
) {
}