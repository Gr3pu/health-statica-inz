package eu.codetown.healthstatica.lawArticles.pages.policy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class PolicyFragment : Fragment() {

    lateinit var layout: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        layout = PolicyLayout(
            context!!
        )

        container?.addView(layout)
        return layout

    }

}