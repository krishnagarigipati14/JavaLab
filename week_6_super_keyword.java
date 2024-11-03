class Vehicle{
    String name;

    Vehicle(String name){
        this.name = name;
    }

    public void Display(){
        System.out.println(name);
    }
}

class Car extends Vehicle{
    int maxSpeed;
    Car(String name, int maxSpeed){
        super(name);
        this.maxSpeed = maxSpeed;
    }

    public void Display(){
        super.Display();
        System.out.println(maxSpeed);
    }
}

public class week_6_super_keyword {
    public static void main(String[] args) {
        Car car = new Car("Bugatti", 125);
        car.Display();
    }
}
