package eu.codetown.healthstatica.core.mvi

interface ViewStateReducer<TViewState: ViewState, in TStateChange> {
    fun reduce(previousState: TViewState, change: TStateChange): TViewState
}
