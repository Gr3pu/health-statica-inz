package eu.codetown.healthstatica.screens.profile

import eu.codetown.healthstatica.core.CoreMviFragment
import eu.codetown.healthstatica.screens.archive.mvi.ProfilePresenter
import eu.codetown.healthstatica.screens.archive.mvi.ProfileView
import eu.codetown.healthstatica.screens.archive.mvi.ProfileViewState
import eu.codetown.healthstatica.screens.archive.services.ProfileUseCase

abstract class ProfileScreenBase : CoreMviFragment<ProfilePresenter, ProfileView, ProfileViewState>(),
    ProfileView {
    protected abstract var layout: ProfileLayout

    override fun createPresenter(): ProfilePresenter {
        return ProfilePresenter(ProfileUseCase())
    }

    // intents here

    // base methods here
}