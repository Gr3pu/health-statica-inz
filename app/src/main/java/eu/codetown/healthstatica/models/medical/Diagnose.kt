package eu.codetown.healthstatica.models.medical

import java.util.*

data class Diagnose(
    var id: UUID,
    var userId: UUID,
    var createdAt: Date,
    var condition: String,
    var probability: Int, // 0-100
    var signaturedDoctor: Doctor?,
    var description: String,
    var wasUseful: Boolean,
    var requiredDoctorAppointment: Boolean,
    var isConditionCritical: Boolean,
    var doneActions: List<String>
    )