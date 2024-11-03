class Calc1{
    int a;
    int b;

    Calc1(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int add(){
        return a+b;
    }
}

public class week_3_class_basics {
    public static void main(String[] args) {
        Calc1 c1 = new Calc1(4,5);
        int add = c1.add();
        System.out.println(add);
    }
}
