package eu.codetown.healthstatica.screens.diagnoses.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateReducer

class DiagnosesViewStateReducer: ViewStateReducer<DiagnosesViewState, DiagnosesViewStateChange> {
    override fun reduce(previousState: DiagnosesViewState, change: DiagnosesViewStateChange): DiagnosesViewState {
        val currentState = DiagnosesViewState()
        currentState.copyStateFrom(previousState)

        // reduce content ( sign into view state )

        return currentState
    }
}