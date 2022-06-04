package app.mvc.controller

import app.mvc.database.UserDatabase

class LoginController {

    fun validateLogin(username: String, password: String): String {
        return if (
            username == UserDatabase.getCurrentUser().user_name &&
            password == UserDatabase.getCurrentUser().password
        )
            "success"
        else "false"
    }

}