package eu.codetown.healthstatica.screens.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import eu.codetown.healthstatica.R
import eu.codetown.healthstatica.core.DelegatedRenderer
import eu.codetown.healthstatica.screens.notifications.mvi.NotificationsViewState

class NotificationsScreen : NotificationsScreenBase() {

    override lateinit var layout: NotificationsLayout

    private val renderer = DelegatedRenderer<NotificationsViewState>(shouldRenderAllWhen = {
        true // if should be updated
    }){

    }

    override fun render(state: NotificationsViewState) {
        renderer.render(state)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
//        layout = NotificationsLayout(this.activity!!)
//        layout.id = View.generateViewId()

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_account_settings, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}