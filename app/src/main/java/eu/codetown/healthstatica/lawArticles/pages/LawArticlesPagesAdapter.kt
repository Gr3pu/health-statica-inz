package eu.codetown.healthstatica.lawArticles.pages

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import eu.codetown.healthstatica.lawArticles.pages.policy.PolicyFragment
import eu.codetown.healthstatica.lawArticles.pages.privacy.PrivacyFragment
import eu.codetown.healthstatica.lawArticles.pages.rules.RulesFragment
import java.lang.Exception


class LawArticlesPagesAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                PolicyFragment()
            }
            1 -> {
                PrivacyFragment()
            }
            2 -> {
                RulesFragment()
            }
            else -> throw Exception("blablalbla")
        }
    }

    override fun getCount(): Int {
        return 3
    }

}