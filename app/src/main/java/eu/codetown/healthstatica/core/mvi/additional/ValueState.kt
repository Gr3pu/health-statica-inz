package eu.codetown.healthstatica.core.mvi.additional

data class ValueState<T>(var value: T?) : PartialViewState {
    constructor(): this(null)

    override fun snapshot(): PartialViewState {
        return this.copy()
    }
}