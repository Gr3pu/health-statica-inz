package eu.codetown.healthstatica.core.mvi.additional

interface PartialViewState {
    fun snapshot(): PartialViewState
}