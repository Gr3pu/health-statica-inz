package eu.codetown.healthstatica.screens.notifications.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateReducer

class NotificationsViewStateReducer: ViewStateReducer<NotificationsViewState, NotificationsViewStateChange> {
    override fun reduce(previousState: NotificationsViewState, change: NotificationsViewStateChange): NotificationsViewState {
        val currentState = NotificationsViewState()
        currentState.copyStateFrom(previousState)

        // reduce content ( sign into view state )

        return currentState
    }
}