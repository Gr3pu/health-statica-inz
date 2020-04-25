package eu.codetown.healthstatica.core

import eu.codetown.healthstatica.core.mvi.ViewState

class DelegatedRenderer<TViewState : ViewState> (private val init: DelegatedRenderer<TViewState>.() -> Unit )
    : BaseRenderer<TViewState>() {

    constructor(shouldRenderAllWhen: () -> Boolean, init: DelegatedRenderer<TViewState>.() -> Unit) : this(init) {
        this.shouldRenderAll = shouldRenderAllWhen
    }

    init {
        init()
    }
}