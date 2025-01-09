package hwCw;

public class Rectangular extends Shape {
    private double width;
    private double height;

    public Rectangular(double width, double height) throws NegNumException {
        if (width < 0 || height < 0) {
            throw new NegNumException("Negative number not Supported");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

