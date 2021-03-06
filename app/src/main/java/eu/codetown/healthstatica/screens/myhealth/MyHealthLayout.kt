package eu.codetown.healthstatica.screens.myhealth

import android.content.Context
import android.util.AttributeSet
import eu.codetown.healthstatica.core.CoreLayout
import org.jetbrains.anko.textView

class MyHealthLayout : CoreLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    override fun generateView() {
        textView {
            text = "example MyHealthLayout from Bartosz"
        }
    }
}