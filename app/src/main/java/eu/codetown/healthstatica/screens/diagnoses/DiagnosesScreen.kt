package eu.codetown.healthstatica.screens.diagnoses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eu.codetown.healthstatica.R
import eu.codetown.healthstatica.core.DelegatedRenderer
import eu.codetown.healthstatica.screens.diagnoses.mvi.DiagnosesViewState

class DiagnosesScreen : DiagnosesScreenBase() {

    override lateinit var layout: DiagnosesLayout

    private val renderer = DelegatedRenderer<DiagnosesViewState>(shouldRenderAllWhen = {
        true // if should be updated
    }){

    }

    override fun render(state: DiagnosesViewState) {
        renderer.render(state)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
//        layout = DiagnosesLayout(this.activity!!)
//        layout.id = View.generateViewId()

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_base_diagnoses, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}