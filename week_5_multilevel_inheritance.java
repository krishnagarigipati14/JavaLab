class Animal{
    public void intro(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("I am a dog");
    }
}

class Lab extends Dog{
    public void say(){
        System.out.println("I am an intelligent dog");
    }
}

public class week_5_multilevel_inheritance {
    public static void main(String[] args) {
        Lab l = new Lab();
        l.intro();
        l.bark();
        l.say();
    }
}
