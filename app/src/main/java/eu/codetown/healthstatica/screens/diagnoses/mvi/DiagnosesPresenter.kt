package eu.codetown.healthstatica.screens.diagnoses.mvi

import eu.codetown.healthstatica.core.mvi.Presenter
import eu.codetown.healthstatica.screens.diagnoses.services.DiagnosesUseCase
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers

class DiagnosesPresenter(val useCase: DiagnosesUseCase): Presenter<DiagnosesView, DiagnosesViewState>(
    DiagnosesViewState()
) {

    var reducer = DiagnosesViewStateReducer()

    override fun bindIntents() {
        // intents here

        val stream: Observable<DiagnosesViewStateChange> = Observable.just(DiagnosesViewStateChange.ViewInitialized())

        val reducedStream = stream.scan(initialState) { previousState, change -> reducer.reduce(previousState, change) }
            .distinctUntilChanged()
            .observeOn(AndroidSchedulers.mainThread())

        subscribeViewState(reducedStream) { view, viewState ->
            view.render(viewState)
        }
    }

}