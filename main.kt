fun main() {
    val user1 = User(lastname = "jlex", name = "Amir", age = 23)
    val user2 = User("jlex")
    val user3 = User("jlex","mamad")

    println(user1.name)
    println(user2.name)
    println(user3.name)

    user1.name = "Ali"  // این باعث می‌شه setter اجرا بشه و پیغام چاپ بشه
}


class User(name: String, var lastname: String = "Lastname", var age: Int = 0) {
    var name = name
    get() {
        return "FirstName : $field"
    }
    set(value){
        println("$value was assigned")
        field = value
    }
 
}

