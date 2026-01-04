fun main() {
    val user1 = User(lastname = "jlex", name = "Amir", age = 23)
}


class User(var name: String, var lastname: String, var age: Int) {
   lateinit var favoriteMovie: String

}

