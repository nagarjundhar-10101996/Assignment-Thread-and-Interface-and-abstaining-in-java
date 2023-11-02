/**
 * Innerinterfaceabstraction
 */
interface Shape {
    double getArea();
}
/**
 * Innerinterfaceabstraction
 */
class Rectangle implements Shape {

    private Double len , bre;
    public Rectangle(Double i, Double j) {
        this.len = i;
        this.bre = j;
    }

    public double getArea()
    {
        return this.len*this.bre;
    }
}
/**
 * Innerinterfaceabstraction
 */
class Square implements Shape {
    private Double red;
    public Square(Double i) {
        this.red = i;
    }

    public double getArea()
    {
        return this.red*this.red;
    }
    
}

public class A5 {
    public static void main(String[] args) {
      Rectangle r = new Rectangle( 10.0,20.0);
        Square  s = new Square(10.00);
        System.out.println(s.getArea());
        System.out.println(r.getArea());
    }
}
