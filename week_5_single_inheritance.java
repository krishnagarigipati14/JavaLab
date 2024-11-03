class Parent{
    void showMessage(){
        System.out.println("Hi From Parent");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("I am a child");
    }
}

public class week_5_single_inheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
        child.showMessage();
    }
}
