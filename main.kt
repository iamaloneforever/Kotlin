fun main() {
    val user1 = User(lastname = "jlex", name = "Amir",age = 23)  // استفاده از سازنده اول
    val user2 = User("jlex")  
    val user3 = User("jlex","mamad") 
}

class User(var name: String, var lastname: String = "Lastname", var age: Int = 0) {

 
}

