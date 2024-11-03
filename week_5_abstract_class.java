abstract class Shape{
    public abstract int getArea();
}

class Square extends Shape{
    int side;
    public Square(int side){
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }
}

class Rectangle extends Shape{
    int length;
    int breath;

    public Rectangle(int length, int breath){
        this.length = length;
        this.breath = breath;
    }

    @Override
    public int getArea() {
        return length * breath;
    }
}


public class week_5_abstract_class {
    public static void main(String[] args) {
        Square sq = new Square(2);
        System.out.println(sq.getArea());
        
        Rectangle r = new Rectangle(1,2);
        System.out.println(r.getArea());
    }
}
