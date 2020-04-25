package eu.codetown.healthstatica.login

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import com.google.firebase.auth.FirebaseAuth
import com.jakewharton.rxbinding2.view.clicks
import eu.codetown.healthstatica.MainActivity
import eu.codetown.healthstatica.R
import eu.codetown.healthstatica.lawArticles.LawArticlesScreen
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity: AppCompatActivity(), LoginContract.View {

    private var disposables: CompositeDisposable = CompositeDisposable()
    private var firebaseAuth: FirebaseAuth? = null

    private lateinit var presenter: LoginPresenter



    override lateinit var emailFieldContainer: TextInputLayout
    override lateinit var passwordFieldContainer: TextInputLayout
    override lateinit var passwordConfirmFieldContainer: TextInputLayout

    override lateinit var emailField: EditText
    override lateinit var passwordField: EditText
    override lateinit var passwordConfirmField: EditText

    override lateinit var loginLink: TextView
    override lateinit var registerLink: TextView
    override lateinit var lostPasswordLink: TextView
    override lateinit var webLink: TextView

    override lateinit var submitButton: Button
    override lateinit var formHeader: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(this, this.applicationContext)

        initViewComponents()
        setClickListeners()

        // initialize proper template
        showLoginForm()

//        email = findViewById(R.id.uyeEmail)
//        password = findViewById(R.id.uyeParola)
//        registerButton = findViewById(R.id.yeniUyeButton)
//        firebaseAuth = FirebaseAuth.getInstance()
//        registerButton?.setOnClickListener {
//            var email = email?.text.toString()
//            var password = password?.text.toString()
//
//            if(TextUtils.isEmpty(email)) {
//
//                Toast.makeText(
//                    applicationContext,
//                    "Please fill in the required fields",
//                    Toast.LENGTH_SHORT
//                ).show()
//
//            } else if(TextUtils.isEmpty(password)) {
//
//                Toast.makeText(
//                    applicationContext,
//                    "Please fill in the required fields",
//                    Toast.LENGTH_SHORT
//                ).show()
//
//            } else if(password.length < 6) {
//
//                Toast.makeText(
//                    getApplicationContext(),
//                    "Password must be at least 6 characters",
//                    Toast.LENGTH_SHORT
//                ).show()
//
//            } else {
//                firebaseAuth?.createUserWithEmailAndPassword(email,password)?.addOnCompleteListener {
//                    if(it.isSuccessful) {
//                        startActivity(
//                            Intent(
//                                applicationContext,
//                                MainActivity::class.java
//                            )
//                        )
//                        finish()
//                    } else {
//                        Toast.makeText(
//                            getApplicationContext(),
//                            "E-mail or password is wrong",
//                            Toast.LENGTH_SHORT
//                        ).show()
//                    }
//                }
//            }
//        }
//        loginButton?.setOnClickListener {
//            startActivity(
//                Intent(
//                    applicationContext,
//                    LoginActivity::class.java
//                )
//            )
//        }
//        if(firebaseAuth?.currentUser != null) {
//            startActivity(
//                Intent(
//                    applicationContext,
//                    MainActivity::class.java
//                )
//            )
//        }
    }

    override fun onDestroy() {
        disposables.dispose()
        super.onDestroy()
    }

    private fun initViewComponents() {
        loginLink = findViewById(R.id.loginLink)
        registerLink = findViewById(R.id.registrationLink)
        lostPasswordLink = findViewById(R.id.recoveryLink)
        webLink = findViewById(R.id.webLink)

        emailFieldContainer = findViewById(R.id.emailInputContainer)
        passwordFieldContainer = findViewById(R.id.passwordInputContainer)
        passwordConfirmFieldContainer = findViewById(R.id.passwordConfirmationInputContainer)

        emailField = findViewById(R.id.emailInput)
        passwordField = findViewById(R.id.passwordInput)
        passwordConfirmField = findViewById(R.id.passwordConfirmationInput)

        submitButton = findViewById(R.id.actionButton)
        formHeader = findViewById(R.id.formHeaderText)
    }

    private fun setClickListeners() {
        loginLink.clicks().subscribe {

            showLoginForm()

        }.addTo(disposables)

        registerLink.clicks().subscribe {

            showRegisterForm()

        }.addTo(disposables)

        recoveryLink.clicks().subscribe {

            showLostPasswordForm()

        }.addTo(disposables)

        webLink.clicks().subscribe {

            redirectToWebsite()

        }.addTo(disposables)

        submitButton.clicks().subscribe {

            presenter.performLogin("", "").subscribe {
                startActivity(Intent(applicationContext, MainActivity::class.java))
                finish()
            }

        }.addTo(disposables)
    }



    override fun showLoginForm() {
        // hide fields
        emailFieldContainer.visibility = View.VISIBLE
        passwordFieldContainer.visibility = View.VISIBLE
        passwordConfirmFieldContainer.visibility = View.GONE

        // change title
        formHeaderText.text = getString(R.string.LoginView_Header_Login)

        // hide links
        loginLink.visibility = View.GONE
        registerLink.visibility = View.VISIBLE
        recoveryLink.visibility = View.VISIBLE
    }

    override fun showRegisterForm() {
        // hide fields
        emailFieldContainer.visibility = View.VISIBLE
        passwordFieldContainer.visibility = View.VISIBLE
        passwordConfirmFieldContainer.visibility = View.VISIBLE

        // change title
        formHeaderText.text = getString(R.string.LoginView_Header_Registration)

        // hide links
        loginLink.visibility = View.VISIBLE
        registerLink.visibility = View.GONE
        recoveryLink.visibility = View.VISIBLE
    }

    override fun showLostPasswordForm() {
        emailFieldContainer.visibility = View.VISIBLE
        passwordFieldContainer.visibility = View.GONE
        passwordConfirmFieldContainer.visibility = View.GONE

        // change title
        formHeaderText.text = getString(R.string.LoginView_Header_Recovery)

        // hide links
        loginLink.visibility = View.VISIBLE
        registerLink.visibility = View.VISIBLE
        recoveryLink.visibility = View.GONE
    }

    override fun showMessage(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showError(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearInputs() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun redirectToWebsite() {
        val viewIntent = Intent("android.intent.action.VIEW", Uri.parse("https://codetown.eu/"))
        startActivity(viewIntent)
    }
}