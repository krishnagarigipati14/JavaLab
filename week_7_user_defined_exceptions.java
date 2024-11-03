class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Call the constructor of the parent class (Exception)
    }
}

public class week_7_user_defined_exceptions {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16); // This will throw InvalidAgeException
        } catch (InvalidAgeException e) {
            // Handle the user-defined exception
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Execution of the user-defined exception demonstration is complete.");
    }

}
