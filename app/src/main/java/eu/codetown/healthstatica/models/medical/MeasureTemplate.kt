package eu.codetown.healthstatica.models.medical

import java.util.*

data class MeasureTemplate(
    var id: UUID,
    var createdAt: Date,
    var name: String,
    var description: String,
    var type: String
)