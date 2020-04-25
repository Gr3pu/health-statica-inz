package eu.codetown.healthstatica.screens.archive.mvi

import eu.codetown.healthstatica.core.mvi.Presenter
import eu.codetown.healthstatica.screens.archive.services.ProfileUseCase
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers

class ProfilePresenter(val useCase: ProfileUseCase): Presenter<ProfileView, ProfileViewState>(
    ProfileViewState()
) {

    var reducer = ProfileViewStateReducer()

    override fun bindIntents() {
        // intents here

        val stream: Observable<ProfileViewStateChange> = Observable.just(ProfileViewStateChange.ViewInitialized())

        val reducedStream = stream.scan(initialState) { previousState, change -> reducer.reduce(previousState, change) }
            .distinctUntilChanged()
            .observeOn(AndroidSchedulers.mainThread())

        subscribeViewState(reducedStream) { view, viewState ->
            view.render(viewState)
        }
    }

}