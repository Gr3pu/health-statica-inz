package eu.codetown.healthstatica.core.mvi.additional

import java.util.*

class TriggerAction<TValue> : PartialViewState {
    var reference: ReferenceHolder<TValue?>
    var version: UUID

    constructor(){
        version = UUID.randomUUID()
        reference = ReferenceHolder(null, false)
    }

    private constructor(copy: TriggerAction<TValue>){
        this.reference = copy.reference
        this.version = copy.version
    }

    val shouldBeHandled: Boolean
        get() {
            return reference.shouldBeHandled
        }

    fun handle(): TValue? {
        this.version = UUID.randomUUID()
        val value = this.reference.value
        this.reference.value = null
        this.reference.shouldBeHandled = false

        return value?.value
    }

    fun dispatch(value: TValue) {
        this.version = UUID.randomUUID()
        this.reference.value = Value(value)
        this.reference.shouldBeHandled = true
    }

    override fun snapshot(): PartialViewState {
        val copy = TriggerAction<TValue>(this)

        return copy
    }

    data class ReferenceHolder<TValue>(
        var value: Value<TValue>?,
        var shouldBeHandled: Boolean
    )

    data class Value<TValue>(var value: TValue)

    override fun hashCode(): Int {
        return version.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TriggerAction<*>

        if (version != other.version) return false

        return true
    }
}
