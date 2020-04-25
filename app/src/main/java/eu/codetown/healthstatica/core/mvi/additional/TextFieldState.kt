package eu.codetown.healthstatica.core.mvi.additional

import eu.codetown.healthstatica.core.mvi.additional.PartialViewState

data class TextFieldState(var text: String = "",
                          var isInvalid: Boolean = false)
    : PartialViewState {

    override fun snapshot(): PartialViewState {
        return this.copy()
    }
}
