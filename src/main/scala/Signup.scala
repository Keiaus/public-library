import scala.io.StdIn.readLine
import Login.* 

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

// writes to a json file
def write_to_json(): Unit =
    // To do 

def pass_checker(new_pass: String, new_pass2: String): Boolean = 
    var is_true: Boolean = true
    if (new_pass != new_pass2)
        !is_true
    else 
        is_true

@main def main() = 
    print("Enter your first name: ")
    var first_name_input = readLine()
    println()
    print("Enter your last name: ")
    var last_name_input = readLine()
    println()
    print("Enter your email address: ")
    var email_input = readLine()
    println()
    print("Enter your username: ")
    var username_input = readLine()
    println()
    print("Enter your phone number: ")
    var phone_number_input = readLine()
    println()
    print("Enter your gender: ")
    var gender_input = readLine()
    println()
    print("Enter your password: ")
    var pass_input = readLine()
    println()
    print("Enter your password again: ")
    var pass2_input = readLine()
    println()

    if (pass_checker(pass_input, pass2_input) != true) {
        println("Passwords must match")
        println()
        print("Enter your password: ")
        pass_input = readLine()
        println()
        print("Enter your password again: ")
        pass2_input = readLine()

        while (pass_checker(pass_input, pass2_input) != true) {
            println("Passwords must match")
            println()
            print("Enter your password: ")
            pass_input = readLine()
            println()
            print("Enter your password again: ")
            pass2_input = readLine()
        }
    }

    else {
        // Go to login
    }
   
        
    // val new_user = User.createUser("John Doe", "jd@yahoo.com")
