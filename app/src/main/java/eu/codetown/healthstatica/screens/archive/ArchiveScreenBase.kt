package eu.codetown.healthstatica.screens.archive

import eu.codetown.healthstatica.core.CoreMviFragment
import eu.codetown.healthstatica.screens.archive.mvi.ArchivePresenter
import eu.codetown.healthstatica.screens.archive.mvi.ArchiveView
import eu.codetown.healthstatica.screens.archive.mvi.ArchiveViewState
import eu.codetown.healthstatica.screens.archive.services.ArchiveUseCase

abstract class ArchiveScreenBase : CoreMviFragment<ArchivePresenter, ArchiveView, ArchiveViewState>(),
    ArchiveView {
    protected abstract var layout: ArchiveLayout

    override fun createPresenter(): ArchivePresenter {
        return ArchivePresenter(ArchiveUseCase())
    }

    // intents here

    // base methods here
}