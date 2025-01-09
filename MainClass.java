package hwCw;

public class MainClass {
    public static void main(String[] args) {
        try {
            Shape square = new Square(4.0);
            Shape circle = new CircleC(7.0);
            Shape rectangle = new Rectangular(5.0, 8.0);

            System.out.println("Area of Calculated Square is: " + square.calculateArea()+" unit");
            System.out.println("Area of Calculated Circle is : " + circle.calculateArea()+" unit");
            System.out.println("Area of Calculated Rectangle is : " + rectangle.calculateArea()+" unit");
        }
        catch (NegNumException e)
        {
            System.err.println("Exception: " + e.getMessage());
        }
    }

}
