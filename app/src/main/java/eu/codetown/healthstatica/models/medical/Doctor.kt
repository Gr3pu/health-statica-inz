package eu.codetown.healthstatica.models.medical

import java.util.*

data class Doctor(
    var id: UUID,
    var name: String,
    var description: String,
    var avatar: ByteArray,
    var specialization: String,
    var workLocation: Pair<Float, Float>, // szerokosc, dlugosc
    var workLocationRadius: Int // km
)