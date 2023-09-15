import scala.io.StdIn.readLine
import scala.compiletime.ops.int

class Home {
    def main() = 
        println("\nPublic Library\n")
        println("1) Sign Up")
        println("2) Log In")
        var input = readLine();
        
        input match
            case 1 => signup()
            case 2 => login()

    def signup() = 
}
    
    