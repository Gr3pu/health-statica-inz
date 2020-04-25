package eu.codetown.healthstatica.subscribtions.pages.list

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import eu.codetown.healthstatica.R
import org.jetbrains.anko.*

class ListLayout : LinearLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(
        context,
        attrs,
        defStyle
    )

    init {
        setPaddingRelative(dip(8), dip(8), dip(8), dip(57))

        scrollView {
            layoutParams = LayoutParams(matchParent, matchParent)

            linearLayout {
                orientation = VERTICAL
                layoutParams = ViewGroup.LayoutParams(matchParent, wrapContent)

                linearLayout {

                    orientation = VERTICAL
                    setBackgroundResource(R.drawable.shadow)
                    val padding = dip(20)
                    setPaddingRelative(padding, padding, padding, padding)

                    textView {
                        textSize = 20f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.primaryDarkColor

                        text = "WERSJA TESTOWA"
                    }.lparams(matchParent, wrapContent)

                    linearLayout { setBackgroundColor(Color.parseColor("#2C292B2C")) }.lparams(
                        matchParent,
                        dip(2)
                    ) { setMargins(0, dip(10), 0, dip(10)) }

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Zapisywanie pomiarów ciała wraz ze zdjęciami"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Archiwizowanie pomiarów lokalnie bez ograniczeń"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Archiwizowanie pomiarów w chmurze do 1Gb"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Tworzenie wykresów"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_clear_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Eksportowanie danych do PDF"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_clear_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Szyfrowanie danych"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_clear_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Analiza wyników przez sieć neuronową"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_clear_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Analiza wyników przez lekarza"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_clear_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Okresowe diagnozy(co 5 pomiarów)"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    linearLayout { setBackgroundColor(Color.parseColor("#2C292B2C")) }.lparams(
                        matchParent,
                        dip(2)
                    ) { setMargins(0, dip(10), 0, dip(10)) }

                    textView {
                        textSize = 25f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.colorAccent

                        text = "$ 0"
                    }.lparams(matchParent, wrapContent)

                    textView {
                        textSize = 14f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.primaryDarkColor

                        text = "na miesiąc"
                    }.lparams(matchParent, wrapContent) { setMargins(0, dip(10), 0, 0) }

                    textView {
                        textSize = 12f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.colorAccent

                        text = "przy subskrybcji rocznej"
                    }.lparams(matchParent, wrapContent)

                }.lparams(matchParent, wrapContent) {
                    setMargins(0, 0, 0, dip(10))
                }

                linearLayout {

                    orientation = VERTICAL
                    setBackgroundResource(R.drawable.shadow)
                    val padding = dip(20)
                    setPaddingRelative(padding, padding, padding, padding)

                    textView {
                        textSize = 20f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.primaryDarkColor

                        text = "POZIOM \"START\""
                    }.lparams(matchParent, wrapContent)

                    linearLayout { setBackgroundColor(Color.parseColor("#2C292B2C")) }.lparams(
                        matchParent,
                        dip(2)
                    ) { setMargins(0, dip(10), 0, dip(10)) }

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Zapisywanie pomiarów ciała wraz ze zdjęciami"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Archiwizowanie pomiarów lokalnie bez ograniczeń"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Archiwizowanie pomiarów w chmurze do 1Gb"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Tworzenie wykresów"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Eksportowanie danych do PDF"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Szyfrowanie danych"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_clear_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Analiza wyników przez sieć neuronową"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_clear_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Analiza wyników przez lekarza"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_clear_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Okresowe diagnozy(co 5 pomiarów)"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    linearLayout { setBackgroundColor(Color.parseColor("#2C292B2C")) }.lparams(
                        matchParent,
                        dip(2)
                    ) { setMargins(0, dip(10), 0, dip(10)) }

                    textView {
                        textSize = 25f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.colorAccent

                        text = "$ 1"
                    }.lparams(matchParent, wrapContent)

                    textView {
                        textSize = 14f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.primaryDarkColor

                        text = "na miesiąc"
                    }.lparams(matchParent, wrapContent) { setMargins(0, dip(10), 0, 0) }

                    textView {
                        textSize = 12f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.colorAccent

                        text = "przy subskrybcji rocznej"
                    }.lparams(matchParent, wrapContent)

                }.lparams(matchParent, wrapContent) {
                    setMargins(0, 0, 0, dip(10))
                }

                linearLayout {

                    orientation = VERTICAL
                    setBackgroundResource(R.drawable.shadow)
                    val padding = dip(20)
                    setPaddingRelative(padding, padding, padding, padding)

                    textView {
                        textSize = 20f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.primaryDarkColor

                        text = "POZIOM \"PRO\""
                    }.lparams(matchParent, wrapContent)

                    linearLayout { setBackgroundColor(Color.parseColor("#2C292B2C")) }.lparams(
                        matchParent,
                        dip(2)
                    ) { setMargins(0, dip(10), 0, dip(10)) }

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Zapisywanie pomiarów ciała wraz ze zdjęciami"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Archiwizowanie pomiarów lokalnie bez ograniczeń"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Archiwizowanie pomiarów w chmurze do 1Gb"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Tworzenie wykresów"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Eksportowanie danych do PDF"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Szyfrowanie danych"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Analiza wyników przez sieć neuronową"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Analiza wyników przez lekarza"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    themedLinearLayout(R.style.RowLabel) {
                        themedImageView(R.style.LabelIcon) { setImageResource(R.drawable.ic_check_black_24dp) }
                        themedTextView(R.style.BaseLabel) { text = "Okresowe diagnozy(co 5 pomiarów)"
                        }.lparams(wrapContent, wrapContent)
                    }.lparams(matchParent, wrapContent)

                    linearLayout { setBackgroundColor(Color.parseColor("#2C292B2C")) }.lparams(
                        matchParent,
                        dip(2)
                    ) { setMargins(0, dip(10), 0, dip(10)) }

                    textView {
                        textSize = 25f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.colorAccent

                        text = "$ 5"
                    }.lparams(matchParent, wrapContent)

                    textView {
                        textSize = 14f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.primaryDarkColor

                        text = "na miesiąc"
                    }.lparams(matchParent, wrapContent) { setMargins(0, dip(10), 0, 0) }

                    textView {
                        textSize = 12f
                        textAlignment = View.TEXT_ALIGNMENT_CENTER
                        textColorResource = R.color.colorAccent

                        text = "przy subskrybcji rocznej"
                    }.lparams(matchParent, wrapContent)

                }.lparams(matchParent, wrapContent) {
                    setMargins(0, 0, 0, dip(10))
                }
            }
        }

    }

}