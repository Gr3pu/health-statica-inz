package eu.codetown.healthstatica.core.mvi

import com.hannesdorfmann.mosby3.mvp.MvpView

interface View<TViewState>: MvpView where TViewState: ViewState {
    fun render(state: TViewState)
}