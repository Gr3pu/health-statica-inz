package eu.codetown.healthstatica.screens.myhealth.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateChange

sealed class MyHealthViewStateChange: ViewStateChange {
    class ViewInitialized(): MyHealthViewStateChange()
}