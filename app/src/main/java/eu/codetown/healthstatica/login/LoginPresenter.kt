package eu.codetown.healthstatica.login

import android.content.Context
import android.content.Intent
import eu.codetown.healthstatica.MainActivity
import io.reactivex.Observable

class LoginPresenter(private val view: LoginContract.View, private val context: Context): LoginContract.Presenter {
    override fun validateLoginForm(username: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun performLogin(username: String, password: String): Observable<Boolean> {
        return Observable.just(true)
    }

    override fun validateRegistrationForm(username: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun performRegistration(username: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun validateRecoveryForm(username: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun performRecovery(username: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearForm(username: String, password: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun satDefaultData(username: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getDefaultData(username: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}