package app.mvc.database

import app.mvc.model.User

object UserDatabase {

    fun getCurrentUser(): User {
        return User("Omar", "1234")
    }

}