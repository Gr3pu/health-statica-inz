package eu.codetown.healthstatica.models.articles

import java.util.*

data class LawDocument(
    var id: UUID,
    var name: String,
    var content: String,
    var createdAt: Date,
    var lastModified: Date,
    var type: LawDocumentEnum
)