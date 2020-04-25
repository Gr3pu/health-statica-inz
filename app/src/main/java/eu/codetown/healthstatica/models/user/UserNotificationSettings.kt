package eu.codetown.healthstatica.models.user

import java.util.*

data class UserNotificationSettings(
    var id: UUID,
    var userId: UUID,
    var lastModifiedAt: Date
)