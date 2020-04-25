package eu.codetown.healthstatica.subscribtions.pages.owned

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.core.view.marginBottom
import androidx.core.view.setMargins
import androidx.core.view.setPadding
import eu.codetown.healthstatica.R
import org.jetbrains.anko.*

class OwnedLayout: LinearLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    init {
        setPaddingRelative(dip(8), dip(8), dip(8), dip(57))
        orientation = VERTICAL

        scrollView {
            layoutParams = LayoutParams(matchParent, matchParent)

            linearLayout {
                orientation = VERTICAL
                layoutParams = ViewGroup.LayoutParams(matchParent, wrapContent)

                // NAZWA PRZYPISANEJ SUBSKRYPCJI
                linearLayout {

                    orientation = VERTICAL
                    setBackgroundResource(R.drawable.shadow)
                    val padding = dip(20)
                    setPaddingRelative(padding, padding, padding, padding)

                    linearLayout {

                        textView {
                            text = "Posiadana subskrybcja"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                        }.lparams(wrapContent, wrapContent)

                        textView {
                            text = "POZIOM 2"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                            gravity = Gravity.END
                            setTypeface(this.typeface, Typeface.BOLD)
                        }.lparams(0, wrapContent) { weight = 1f }

                    }.lparams(matchParent, wrapContent)

                    linearLayout {

                        textView {
                            text = "Wartość"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                        }.lparams(wrapContent, wrapContent)

                        textView {
                            text = "$5"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                            gravity = Gravity.END
                            setTypeface(this.typeface, Typeface.BOLD)
                        }.lparams(0, wrapContent) { weight = 1f }

                    }.lparams(matchParent, wrapContent)

                    linearLayout {

                        textView {
                            text = "Data zamówienia"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                        }.lparams(wrapContent, wrapContent)

                        textView {
                            text = "12.07.2019"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                            gravity = Gravity.END
                            setTypeface(this.typeface, Typeface.BOLD)
                        }.lparams(0, wrapContent) { weight = 1f }

                    }.lparams(matchParent, wrapContent)

                    textView {
                        text = "Twoja subskrybcja zostanie odnowiona 11.07.2020 roku z wykorzystaniem zapisanej metody płatności."
                        allCaps = true
                        textSize = 12f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.colorAccent
                    }.lparams(wrapContent, wrapContent){ setMargins(dip(20)) }

                }.lparams(matchParent, wrapContent) {
                    setMargins(0, 0, 0, dip(10))
                }

                // USTAWIENIA PLATNOSCI
                linearLayout {

                    orientation = VERTICAL
                    setBackgroundResource(R.drawable.shadow)
                    val padding = dip(20)
                    setPaddingRelative(padding, padding, padding, padding)

                    textView {
                        textSize = 20f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.primaryDarkColor

                        text = "Metoda płatności"
                    }.lparams(matchParent, wrapContent) { setMargins(0, 0, 0, dip(10))}

                    linearLayout { setBackgroundColor(Color.parseColor("#2C292B2C")) }.lparams(matchParent, dip(2))

                    linearLayout {

                        textView {
                            text = "Numer karty"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                        }.lparams(wrapContent, wrapContent)

                        textView {
                            text = "1234 **** **** **12"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                            gravity = Gravity.END
                            setTypeface(this.typeface, Typeface.BOLD)
                        }.lparams(0, wrapContent) { weight = 1f }

                    }.lparams(matchParent, wrapContent) { setMargins(0, dip(20), 0, 0)}

                    linearLayout {

                        textView {
                            text = "Ważność"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                        }.lparams(wrapContent, wrapContent)

                        textView {
                            text = "01/21"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                            gravity = Gravity.END
                            setTypeface(this.typeface, Typeface.BOLD)
                        }.lparams(0, wrapContent) { weight = 1f }

                    }.lparams(matchParent, wrapContent)

                    linearLayout {

                        textView {
                            text = "Kod CVC"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                        }.lparams(wrapContent, wrapContent)

                        textView {
                            text = "**3"
                            textSize = 14f
                            setTextColor(Color.parseColor("#15243F"))
                            gravity = Gravity.END
                            setTypeface(this.typeface, Typeface.BOLD)
                        }.lparams(0, wrapContent) { weight = 1f }

                    }.lparams(matchParent, wrapContent)

                }.lparams(matchParent, wrapContent) {
                    setMargins(0, 0, 0, dip(10))
                }

                // CO ZROBIC BY ODEJSC
                linearLayout {

                    setBackgroundResource(R.drawable.shadow)
                    val padding = dip(40)
                    setPaddingRelative(padding, padding, padding, padding)

                    textView {
                        allCaps = true
                        textSize = 12f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.colorAccent

                        text = "By zrezygnować z subskrybcji lub usunąś konto skontaktuj się z nami pod adresem: healthstatica@codetown.eu"
                    }

                }.lparams(matchParent, wrapContent) {
                }
            }
        }
    }

}