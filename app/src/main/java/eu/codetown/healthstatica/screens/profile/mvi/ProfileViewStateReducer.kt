package eu.codetown.healthstatica.screens.archive.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateReducer

class ProfileViewStateReducer: ViewStateReducer<ProfileViewState, ProfileViewStateChange> {
    override fun reduce(previousState: ProfileViewState, change: ProfileViewStateChange): ProfileViewState {
        val currentState = ProfileViewState()
        currentState.copyStateFrom(previousState)

        // reduce content ( sign into view state )

        return currentState
    }
}