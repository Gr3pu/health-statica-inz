package eu.codetown.healthstatica.screens.archive.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateChange

sealed class ProfileViewStateChange: ViewStateChange {
    class ViewInitialized(): ProfileViewStateChange()
}