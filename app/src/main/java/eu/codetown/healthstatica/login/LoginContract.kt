package eu.codetown.healthstatica.login

import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import io.reactivex.Observable
import org.w3c.dom.Text

interface LoginContract {

    interface View {
        var emailField: EditText
        var passwordField: EditText
        var passwordConfirmField: EditText

        var emailFieldContainer: TextInputLayout
        var passwordFieldContainer: TextInputLayout
        var passwordConfirmFieldContainer: TextInputLayout

        var loginLink: TextView
        var registerLink: TextView
        var lostPasswordLink: TextView
        var webLink: TextView

        var submitButton: Button
        var formHeader: TextView

        fun showLoginForm()
        fun showRegisterForm()
        fun showLostPasswordForm()

        fun showMessage(message: String)
        fun showError(message: String)

        fun clearInputs()
        fun redirectToWebsite()
    }

    interface Presenter {
        fun validateLoginForm(username: String, password: String)
        fun performLogin(username: String, password: String): Observable<Boolean>

        fun validateRegistrationForm(username: String, password: String)
        fun performRegistration(username: String, password: String)

        fun validateRecoveryForm(username: String, password: String)
        fun performRecovery(username: String, password: String)



        fun clearForm(username: String, password: String)
        fun satDefaultData(username: String)

        fun getDefaultData(username: String): String
    }

}