import scala.io.StdIn.readLine
import scala.compiletime.ops.int

class Home {
    def main() = 
        println("\nLibrary\n")
        println("1) Sign Up")
        println("2) Log In")
        val input = readLine();
        input match 
            case 1 => signup()
            case 2 => login()

    def signup() = 
}
    
    