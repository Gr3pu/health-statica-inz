package eu.codetown.healthstatica.lawArticles.pages.privacy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class PrivacyFragment : Fragment() {

    lateinit var layout: LinearLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        layout = PrivacyLayout(
            context!!
        )

        container?.addView(layout)
        return layout

    }

}