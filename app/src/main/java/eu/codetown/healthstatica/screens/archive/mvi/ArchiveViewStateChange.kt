package eu.codetown.healthstatica.screens.archive.mvi

import eu.codetown.healthstatica.core.mvi.ViewStateChange

sealed class ArchiveViewStateChange: ViewStateChange {
    class ViewInitialized(): ArchiveViewStateChange()
}