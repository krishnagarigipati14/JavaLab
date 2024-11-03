// Define the Animal interface
interface Animals {
    void sound();
}

// Define the Flyable interface
interface Flyable {
    void fly();
}

// Define the Swimmable interface
interface Swimmable {
    void swim();
}

// Duck class implementing multiple interfaces
class Duck implements Animals, Flyable, Swimmable {
    @Override
    public void sound() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }
}

// Main class to test the Duck implementation
public class week_6_interface {
    public static void main(String[] args) {
        Duck duck = new Duck(); // Create a Duck object

        // Call methods from Duck class
        duck.sound(); // Calls the sound method
        duck.fly();   // Calls the fly method
        duck.swim();  // Calls the swim method
    }
}
