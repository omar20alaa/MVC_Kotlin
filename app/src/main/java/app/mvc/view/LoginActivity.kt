package app.mvc.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import app.mvc.R
import app.mvc.controller.LoginController
import app.mvc.databinding.ActivityLoginBinding
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private val loginController: LoginController = LoginController()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLogin()
    }

    private fun initLogin() {
        binding.btnLogin.setOnClickListener {
            if (loginController.validateLogin(
                    binding.nameEditText.text.toString(),
                    binding.passwordEdittext.text.toString()
                ) == "success"
            ) {
                Snackbar.make(binding.layout, "Hello Omar", Snackbar.LENGTH_LONG).show()
            } else {
                Snackbar.make(
                    binding.layout,
                    "Please Check User Name or Password",
                    Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }


}