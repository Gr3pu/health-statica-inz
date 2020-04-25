package eu.codetown.healthstatica.screens.diagnoses.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateChange

sealed class DiagnosesViewStateChange: ViewStateChange {
    class ViewInitialized(): DiagnosesViewStateChange()
}