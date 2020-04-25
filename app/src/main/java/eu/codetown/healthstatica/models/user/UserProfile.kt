package eu.codetown.healthstatica.models.user

import eu.codetown.healthstatica.models.medical.BodyStatus
import eu.codetown.healthstatica.models.medical.Diagnose
import java.util.*

data class UserProfile(
    var id: UUID,
    var name: String,
    var email: String,
    var phone: String,
    var createdAt: Date,
    var lastModifiedAt: Date,
    var plan: SubscriptionLevelEnum,
    var planExpireAt: Date,
    var agreementSettings: UserAgreementSettings,
    var notificationSettings: UserNotificationSettings,
    var diagnoses: Collection<Diagnose>,
    var bodyStatuses: Collection<BodyStatus>
)