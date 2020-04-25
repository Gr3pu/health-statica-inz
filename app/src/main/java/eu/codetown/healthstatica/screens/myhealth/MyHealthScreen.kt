package eu.codetown.healthstatica.screens.myhealth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eu.codetown.healthstatica.R
import eu.codetown.healthstatica.core.DelegatedRenderer
import eu.codetown.healthstatica.screens.myhealth.mvi.MyHealthViewState

class MyHealthScreen : MyHealthScreenBase() {

    override lateinit var layout: MyHealthLayout

    private val renderer = DelegatedRenderer<MyHealthViewState>(shouldRenderAllWhen = {
        true // if should be updated
    }){

    }

    override fun render(state: MyHealthViewState) {
        renderer.render(state)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
//        layout = MyHealthLayout(this.activity!!)
//        layout.id = View.generateViewId()

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_base_health, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}