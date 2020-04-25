package eu.codetown.healthstatica.screens.diagnoses

import android.content.Context
import android.util.AttributeSet
import eu.codetown.healthstatica.core.CoreLayout
import org.jetbrains.anko.textView

class DiagnosesLayout : CoreLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    override fun generateView() {
        textView {
            text = "example DiagnosesLayout from Bartosz"
        }
    }
}