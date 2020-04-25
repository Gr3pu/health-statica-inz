package eu.codetown.healthstatica.screens.notifications.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateChange

sealed class NotificationsViewStateChange: ViewStateChange {
    class ViewInitialized(): NotificationsViewStateChange()
}