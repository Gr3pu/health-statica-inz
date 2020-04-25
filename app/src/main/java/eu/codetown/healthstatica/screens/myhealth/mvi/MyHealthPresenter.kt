package eu.codetown.healthstatica.screens.myhealth.mvi

import eu.codetown.healthstatica.core.mvi.Presenter
import eu.codetown.healthstatica.screens.myhealth.services.MyHealthUseCase
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers

class MyHealthPresenter(val useCase: MyHealthUseCase): Presenter<MyHealthView, MyHealthViewState>(
    MyHealthViewState()
) {

    var reducer = MyHealthViewStateReducer()

    override fun bindIntents() {
        // intents here

        val stream: Observable<MyHealthViewStateChange> = Observable.just(MyHealthViewStateChange.ViewInitialized())

        val reducedStream = stream.scan(initialState) { previousState, change -> reducer.reduce(previousState, change) }
            .distinctUntilChanged()
            .observeOn(AndroidSchedulers.mainThread())

        subscribeViewState(reducedStream) { view, viewState ->
            view.render(viewState)
        }
    }

}