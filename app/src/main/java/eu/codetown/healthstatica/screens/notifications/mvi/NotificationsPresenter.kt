package eu.codetown.healthstatica.screens.notifications.mvi

import eu.codetown.healthstatica.core.mvi.Presenter
import eu.codetown.healthstatica.screens.notifications.services.NotificationsUseCase
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers

class NotificationsPresenter(val useCase: NotificationsUseCase): Presenter<NotificationsView, NotificationsViewState>(
    NotificationsViewState()
) {

    var reducer = NotificationsViewStateReducer()

    override fun bindIntents() {
        // intents here

        val stream: Observable<NotificationsViewStateChange> = Observable.just(NotificationsViewStateChange.ViewInitialized())

        val reducedStream = stream.scan(initialState) { previousState, change -> reducer.reduce(previousState, change) }
            .distinctUntilChanged()
            .observeOn(AndroidSchedulers.mainThread())

        subscribeViewState(reducedStream) { view, viewState ->
            view.render(viewState)
        }
    }

}