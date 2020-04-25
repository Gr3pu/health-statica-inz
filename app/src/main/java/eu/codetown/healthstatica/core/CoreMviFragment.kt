package eu.codetown.healthstatica.core

import android.os.Bundle
import com.hannesdorfmann.mosby3.mvi.MviFragment
import eu.codetown.healthstatica.core.mvi.Presenter
import eu.codetown.healthstatica.core.mvi.View
import eu.codetown.healthstatica.core.mvi.ViewState

abstract class CoreMviFragment<TPresenter: Presenter<TView, TViewState>, TView : View<TViewState>, TViewState : ViewState>: MviFragment<TView, TPresenter>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}