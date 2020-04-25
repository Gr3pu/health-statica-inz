package eu.codetown.healthstatica.subscribtions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import eu.codetown.healthstatica.R
import eu.codetown.healthstatica.lawArticles.pages.LawArticlesPagesAdapter
import eu.codetown.healthstatica.subscribtions.mvp.SubscribtionsLayout
import eu.codetown.healthstatica.subscribtions.mvp.SubscribtionsPresenter
import eu.codetown.healthstatica.subscribtions.mvp.SubscriptionsContract
import eu.codetown.healthstatica.subscribtions.pages.SubscribtionsPagesAdapter

class SubscribtionsScreen: Fragment(), SubscriptionsContract.View {

    private lateinit var presenter: SubscribtionsPresenter
    private lateinit var layout: SubscribtionsLayout

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        layout = SubscribtionsLayout(context!!)
        return layout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter =
            SubscribtionsPresenter(
                this,
                context!!
            )
        initializeViewPager()
    }

    private fun initializeViewPager() {
        val pagerAdapter = SubscribtionsPagesAdapter(fragmentManager!!)
        layout.viewPager.offscreenPageLimit = 2
        layout.viewPager.adapter = pagerAdapter

        layout.tabLayout.setupWithViewPager(layout.viewPager)

        layout.tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_nav_my_subscription)
        layout.tabLayout.getTabAt(1)?.text = "Rodzaje subskrypcji"

    }
}