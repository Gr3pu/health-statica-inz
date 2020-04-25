package eu.codetown.healthstatica.models.medical

import java.util.*

data class Measure(
    var id: UUID,
    var bodyStatusId: UUID,
    var createdAt: Date,
    var name: String,
    var value: String,
    var description: String,
    var type: String
)