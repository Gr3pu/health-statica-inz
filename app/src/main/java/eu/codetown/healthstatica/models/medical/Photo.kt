package eu.codetown.healthstatica.models.medical

import java.util.*

data class Photo(
    var id: UUID,
    var bodyStatusId: UUID,
    var createdAt: Date,
    var name: String,
    var image: ByteArray,
    var description: String
)