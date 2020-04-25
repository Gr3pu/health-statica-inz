package eu.codetown.healthstatica.subscribtions.pages

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import eu.codetown.healthstatica.subscribtions.pages.list.ListFragment
import eu.codetown.healthstatica.subscribtions.pages.owned.OwnedFragment
import java.lang.Exception

class SubscribtionsPagesAdapter(fragmentManager: FragmentManager): FragmentStatePagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                OwnedFragment()
            }
            1 -> {
                ListFragment()
            }
            else -> throw Exception("blablalbla")
        }
    }

    override fun getCount(): Int {
        return 2
    }
}