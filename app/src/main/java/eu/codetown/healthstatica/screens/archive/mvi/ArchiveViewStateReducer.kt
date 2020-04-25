package eu.codetown.healthstatica.screens.archive.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateReducer

class ArchiveViewStateReducer: ViewStateReducer<ArchiveViewState, ArchiveViewStateChange> {
    override fun reduce(previousState: ArchiveViewState, change: ArchiveViewStateChange): ArchiveViewState {
        val currentState = ArchiveViewState()
        currentState.copyStateFrom(previousState)

        // reduce content ( sign into view state )

        return currentState
    }
}