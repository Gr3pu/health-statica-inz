package eu.codetown.healthstatica.subscribtions.pages.owned

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class OwnedFragment : Fragment() {

    lateinit var layout: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        layout = OwnedLayout(
            context!!
        )

        container?.addView(layout)
        return layout

    }

}