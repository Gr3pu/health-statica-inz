package eu.codetown.healthstatica.models.user

import java.util.*

data class UserAgreementSettings(
    var id: UUID,
    var userId: UUID,
    var lastModifiedAt: Date
)