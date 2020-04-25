package eu.codetown.healthstatica.screens.archive.mvi

import eu.codetown.healthstatica.core.mvi.Presenter
import eu.codetown.healthstatica.screens.archive.services.ArchiveUseCase
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers

class ArchivePresenter(val useCase: ArchiveUseCase): Presenter<ArchiveView, ArchiveViewState>(
    ArchiveViewState()
) {

    var reducer = ArchiveViewStateReducer()

    override fun bindIntents() {
        // intents here

        val stream: Observable<ArchiveViewStateChange> = Observable.just(ArchiveViewStateChange.ViewInitialized())

        val reducedStream = stream.scan(initialState) { previousState, change -> reducer.reduce(previousState, change) }
            .distinctUntilChanged()
            .observeOn(AndroidSchedulers.mainThread())

        subscribeViewState(reducedStream) { view, viewState ->
            view.render(viewState)
        }
    }

}