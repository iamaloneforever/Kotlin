fun main() {
    val user1 = User("jlex", "Amir", 23)  // استفاده از سازنده اول
    val user2 = User("jlex")  
    val user3 = User("jlex","mamad") 
}

class User(var name: String, var lastname: String, var age: Int) {

    // سازنده دوم که فقط نام می‌گیرد و بقیه مقادیر به صورت پیش‌فرض تنظیم می‌شوند
    constructor(name: String): this(name, "User", 0)
    constructor(name: String,lastname:String): this(name, lastname, 0)
}

