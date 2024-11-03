
class Creature{
    void sound(){
        System.out.println("This makes sound");
    }

}

class Cat extends Creature{
    void sound(){
        System.out.println("Meow");
    }
}

class dog extends Creature{
    void sound(){
        System.out.println("BOWW");
    }
}

public class week_6_runtime_polymorphism {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();

        dog doggie = new dog();
        doggie.sound();
    }
}
