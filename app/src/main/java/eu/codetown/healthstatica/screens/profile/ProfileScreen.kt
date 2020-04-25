package eu.codetown.healthstatica.screens.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eu.codetown.healthstatica.R
import eu.codetown.healthstatica.core.DelegatedRenderer
import eu.codetown.healthstatica.screens.archive.mvi.ProfileViewState

class ProfileScreen : ProfileScreenBase() {

    override lateinit var layout: ProfileLayout

    private val renderer = DelegatedRenderer<ProfileViewState>(shouldRenderAllWhen = {
        true // if should be updated
    }){

    }

    override fun render(state: ProfileViewState) {
        renderer.render(state)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
//        layout = ProfileLayout(this.activity!!)
//        layout.id = View.generateViewId()

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_account_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}