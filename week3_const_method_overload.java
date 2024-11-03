class Calc2{
    int a,b,c;
    public Calc2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calc2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int add(int a, int b) {return a + b;}
    public int add(int a, int b, int c) {return a + b +c;}
}

public class week3_const_method_overload {
    public static void main(String[] args) {
        Calc2 cal1 = new Calc2(1,2);
        Calc2 cal2 = new Calc2(1,2,3);

        System.out.println(cal1.add(1,2));
        System.out.println(cal2.add(1,2,3));
    }
}
