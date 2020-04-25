package eu.codetown.healthstatica.screens.archive

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eu.codetown.healthstatica.R
import eu.codetown.healthstatica.core.DelegatedRenderer
import eu.codetown.healthstatica.screens.archive.mvi.ArchiveViewState

class ArchiveScreen : ArchiveScreenBase() {

    override lateinit var layout: ArchiveLayout

    private val renderer = DelegatedRenderer<ArchiveViewState>(shouldRenderAllWhen = {
        true // if should be updated
    }){

    }

    override fun render(state: ArchiveViewState) {
        renderer.render(state)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
//        layout = ArchiveLayout(this.activity!!)
//        layout.id = View.generateViewId()

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_base_archive, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}