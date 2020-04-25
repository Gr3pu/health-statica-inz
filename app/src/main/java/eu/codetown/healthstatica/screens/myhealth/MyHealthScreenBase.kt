package eu.codetown.healthstatica.screens.myhealth

import eu.codetown.healthstatica.core.CoreMviFragment
import eu.codetown.healthstatica.screens.myhealth.mvi.MyHealthPresenter
import eu.codetown.healthstatica.screens.myhealth.mvi.MyHealthView
import eu.codetown.healthstatica.screens.myhealth.mvi.MyHealthViewState
import eu.codetown.healthstatica.screens.myhealth.services.MyHealthUseCase

abstract class MyHealthScreenBase : CoreMviFragment<MyHealthPresenter, MyHealthView, MyHealthViewState>(),
    MyHealthView {
    protected abstract var layout: MyHealthLayout

    override fun createPresenter(): MyHealthPresenter {
        return MyHealthPresenter(MyHealthUseCase())
    }

    // intents here

    // base methods here
}