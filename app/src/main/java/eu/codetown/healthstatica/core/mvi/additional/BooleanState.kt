package eu.codetown.healthstatica.core.mvi.additional

import eu.codetown.healthstatica.core.mvi.additional.PartialViewState

data class BooleanState(var value: Boolean) : PartialViewState {
    override fun snapshot(): PartialViewState {
        return this.copy()
    }
}

