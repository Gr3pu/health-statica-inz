package eu.codetown.healthstatica.screens.diagnoses

import eu.codetown.healthstatica.core.CoreMviFragment
import eu.codetown.healthstatica.screens.diagnoses.mvi.DiagnosesPresenter
import eu.codetown.healthstatica.screens.diagnoses.mvi.DiagnosesView
import eu.codetown.healthstatica.screens.diagnoses.mvi.DiagnosesViewState
import eu.codetown.healthstatica.screens.diagnoses.services.DiagnosesUseCase

abstract class DiagnosesScreenBase : CoreMviFragment<DiagnosesPresenter, DiagnosesView, DiagnosesViewState>(),
    DiagnosesView {
    protected abstract var layout: DiagnosesLayout

    override fun createPresenter(): DiagnosesPresenter {
        return DiagnosesPresenter(DiagnosesUseCase())
    }

    // intents here

    // base methods here
}