package eu.codetown.healthstatica.models.medical

import java.util.*

data class BodyStatus(
    var id: UUID,
    var userId: UUID,
    var createdAt: Date,
    var measures: Collection<Measure>,
    var photos: Collection<Photo>,
    var feelings: String,
    var additionalInfo: String
)