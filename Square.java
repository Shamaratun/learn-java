package hwCw;

public class Square extends Rectangular {

    public Square(double side) throws NegNumException {
        super(side, side);
        if (side < 0) {
            throw new NegNumException("Area of shapes cant be negative ");
        }
    }
}

