import scala.io.StdIn.readLine

class Signup:
    // private fields for the user
    private var id: Int = 0
    private var first_name: String = " "
    private var last_name: String = " "
    private var email: String = " "
    private var username: String = " "
    private var phone_number: String = " "
    private var gender: String = " "
    private var pass: String = " "
    private var pass2: String = " "

    // getters
    def get_id: Int = id
    def get_first_name: String = first_name
    def get_last_name: String = last_name
    def get_email: String = email
    def get_username: String = username
    def get_phone_number: String = phone_number
    def get_gender: String = gender
    def get_pass: String = pass
    def get_pass2: String = pass2

    // setters
    def set_id(new_id: Int): Unit =
        id = new_id
        id += 1
    def set_first_name(new_first_name: String): Unit =
        first_name = new_first_name
    def set_last_name(new_last_name: String): Unit =
        last_name = new_last_name
    def set_email(new_email: String): Unit =
        email = new_email
    def set_username(new_username: String): Unit =
        username = new_username

    def set_phone_number(new_phone_number: String): Unit =
        phone_number = new_phone_number
    def set_gender(new_gender: String): Unit =
        gender = new_gender
    def set_pass(new_pass: String): Unit =
        pass = new_pass
    def set_pass2(new_pass2: String): Unit =
        pass2 = new_pass2

object User {
    def createUser(
        id: Int, first_name: String, last_name: String, email: String,
        username: String, phone_number: String, gender: String, pass: String, pass2: String
    ): Signup = new Signup()
}

def passChecker(new_pass: String, new_pass2: String): Boolean = 
    pass = new_pass
    pass2 = new_pass2
    var is_true: Boolean = true
    if (pass != pass2) {
        is_true = false
        print("Passwords don't match! Try again: ")
        var userInput = readLine()
        while (pass !)
    }

@main def main() = 
    print("Enter your first name: ")
    val first_name_input = readLine()
    println()
    print("Enter your last name: ")
    val last_name_input = readLine()
    println()
    print("Enter your email address: ")
    val email_input = readLine()
    println()
    print("Enter your username: ")
    val username_input = readLine()
    println()
    print("Enter your phone number: ")
    val phone_number_input = readLine()
    println()
    print("Enter your gender: ")
    val gender_input = readLine()
    println()
    print("Choose your password: ")
    val pass_input = readLine()
    println()
    print("Enter your password again: ")
    val pass2_input = readLine()
    println()

    // val new_user = User.createUser("John Doe", "jd@yahoo.com")
