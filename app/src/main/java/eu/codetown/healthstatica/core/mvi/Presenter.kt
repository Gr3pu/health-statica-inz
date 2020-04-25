package eu.codetown.healthstatica.core.mvi

import com.hannesdorfmann.mosby3.mvi.MviBasePresenter
import eu.codetown.healthstatica.BuildConfig
import io.reactivex.Observable

@Suppress("UNCHECKED_CAST")
abstract class Presenter<TView : View<TViewState>, TViewState: ViewState>(viewState: TViewState)
    : MviBasePresenter<TView, TViewState>(viewState) {

    protected val initialState: TViewState = viewState
    private var viewStateSnapshot: TViewState = viewState

    protected val lastViewState: TViewState
        get() = viewStateSnapshot

    override fun attachView(view: TView) {
        super.attachView(view)

        view.render(viewStateSnapshot)
    }

    override fun subscribeViewState(viewStateObservable: Observable<TViewState>, consumer: ViewStateConsumer<TView, TViewState>) {
        val viewStateStream = if(BuildConfig.DEBUG){
            viewStateObservable
        } else {
            viewStateObservable.map { it as ViewState }
                .onErrorReturn {
                    FailureViewState()
                }.filter { it !is FailureViewState }
                .map { it as TViewState }
        }

        super.subscribeViewState(viewStateStream) { view, viewState ->
            this.viewStateSnapshot = viewState
            consumer.accept(view, viewState)
        }
    }

    private class FailureViewState: ViewState()
}