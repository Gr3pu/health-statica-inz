package eu.codetown.healthstatica.screens.notifications

import eu.codetown.healthstatica.core.CoreMviFragment
import eu.codetown.healthstatica.screens.notifications.mvi.NotificationsPresenter
import eu.codetown.healthstatica.screens.notifications.mvi.NotificationsView
import eu.codetown.healthstatica.screens.notifications.mvi.NotificationsViewState
import eu.codetown.healthstatica.screens.notifications.services.NotificationsUseCase

abstract class NotificationsScreenBase : CoreMviFragment<NotificationsPresenter, NotificationsView, NotificationsViewState>(),
    NotificationsView {
    protected abstract var layout: NotificationsLayout

    override fun createPresenter(): NotificationsPresenter {
        return NotificationsPresenter(NotificationsUseCase())
    }

    // intents here

    // base methods here
}