fun main(args: Array<String>) {
    val user1 = User("John", "Smith",10)
    val user2 = User("John", "Smith",10)

    println(user1 == user2)


}
class User(var firstName: String, var lastName: String,val age:Int){

    override fun equals(other: Any?): Boolean {
         if (this === other) return true
         if (other is User) {
             if (firstName === other.firstName && lastName === other.lastName && age == other.age) return true
         }
        return false
    }
}