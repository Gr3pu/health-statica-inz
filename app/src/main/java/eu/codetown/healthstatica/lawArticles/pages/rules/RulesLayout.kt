package eu.codetown.healthstatica.lawArticles.pages.rules

import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.setMargins
import com.google.android.material.floatingactionbutton.FloatingActionButton
import eu.codetown.healthstatica.R
import org.jetbrains.anko.*
import org.jetbrains.anko.design.floatingActionButton

class RulesLayout: LinearLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    lateinit var contentContainer: LinearLayout

    init {
        setPaddingRelative(dip(8), dip(8), dip(8), dip(57))

        linearLayout {
            layoutParams = ViewGroup.LayoutParams(matchParent, matchParent)

            setBackgroundResource(R.drawable.shadow)
            setPaddingRelative(dip(10), dip(10), dip(10), dip(10))

            relativeLayout {

                scrollView {

                    contentContainer = linearLayout {
                        val paddingBase = dip(15)
                        val paddingBottom = dip(50)

                        setPaddingRelative(paddingBase, paddingBase, paddingBase, paddingBottom)
                        orientation = VERTICAL

                        for (i in 0..8) {
                            textView {
                                text = "Paragraph ${i+1}"
                                textSize = 20f

                                if(i != 0)
                                    setPaddingRelative(0, dip(20), 0, 0)
                            }
                            for(j in 0..6) {
                                textView {
                                    text = "${j+1}. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."
                                }
                            }
                        }

                    }.lparams(matchParent, wrapContent)

                }.lparams(matchParent, matchParent)

            }.lparams(matchParent, matchParent)

        }
    }
}