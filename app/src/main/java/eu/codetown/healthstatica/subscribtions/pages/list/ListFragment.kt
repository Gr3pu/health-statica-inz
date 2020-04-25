package eu.codetown.healthstatica.subscribtions.pages.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class ListFragment : Fragment() {

    lateinit var layout: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        layout = ListLayout(
            context!!
        )

        container?.addView(layout)
        return layout

    }

}