fun main() {
    val user1 = User(lastname = "jlex", name = "Amir", age = 23)
    val user2 = User("jlex")
    val user3 = User("jlex","mamad")

    println(user1.getFirstName())
    println(user2.name)
    println(user3.name)

    user1.name = "Ali"  // این باعث می‌شه setter اجرا بشه و پیغام چاپ بشه
}


class User(name: String, var lastname: String = "Lastname", var age: Int = 0) {
    var name = name

    fun setFirstName(newValue:String){
        this.name = newValue
    }
    fun getFirstName():String{
        return this.name
    }
}

