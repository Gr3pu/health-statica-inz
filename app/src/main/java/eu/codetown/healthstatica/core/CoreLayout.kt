package eu.codetown.healthstatica.core

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import eu.codetown.healthstatica.R
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.wrapContent

abstract class CoreLayout : LinearLayout {
    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    private fun init() {
        layoutParams = LayoutParams(matchParent, wrapContent)
        isFocusableInTouchMode = true
        orientation = VERTICAL
        backgroundColor = ContextCompat.getColor(context, R.color.white)

        generateView()
    }

    abstract fun generateView()
}