package eu.codetown.healthstatica.lawArticles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import eu.codetown.healthstatica.R
import eu.codetown.healthstatica.lawArticles.mvp.LawArticlesContract
import eu.codetown.healthstatica.lawArticles.mvp.LawArticlesLayout
import eu.codetown.healthstatica.lawArticles.mvp.LawArticlesPresenter
import eu.codetown.healthstatica.lawArticles.pages.LawArticlesPagesAdapter

class LawArticlesScreen: Fragment(), LawArticlesContract.View {

    private lateinit var presenter: LawArticlesPresenter
    private lateinit var layout: LawArticlesLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        layout = LawArticlesLayout(context!!)
        return layout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter =
            LawArticlesPresenter(
                this,
                context!!
            )
        // rest of content
        initializeViewPager()
        initViewComponents()
        setClickListeners()
    }

    private fun initializeViewPager() {

        val pagerAdapter = LawArticlesPagesAdapter(fragmentManager!!)
        layout.viewPager.offscreenPageLimit = 3
        layout.viewPager.adapter = pagerAdapter

        layout.tabLayout.setupWithViewPager(layout.viewPager)

        layout.tabLayout.getTabAt(0)?.text = "Regulamin"
        layout.tabLayout.getTabAt(1)?.text = "Politypa prywatności"
        layout.tabLayout.getTabAt(2)?.text = "Zasady korzystania"

    }

    private fun initViewComponents() {

    }

    private fun setClickListeners() {

    }
}