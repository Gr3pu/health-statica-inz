package eu.codetown.healthstatica.screens.myhealth.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateReducer

class MyHealthViewStateReducer: ViewStateReducer<MyHealthViewState, MyHealthViewStateChange> {
    override fun reduce(previousState: MyHealthViewState, change: MyHealthViewStateChange): MyHealthViewState {
        val currentState = MyHealthViewState()
        currentState.copyStateFrom(previousState)

        // reduce content ( sign into view state )

        return currentState
    }
}