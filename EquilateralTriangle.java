public class EquilateralTriangle implements ITriangle {
    // Fields
    // -------------------------------
    private double side, area, perimeter;

    // Public methods
    // -------------------------------
    public EquilateralTriangle(double side) {
        this.side = side;
        calculateArea();
        calculatePerimeter();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // Overrides
    // -------------------------------
    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return perimeter;
    }

    @Override
    public void resize(float factor) {
        this.side = factor * side;
        calculateArea();
        calculatePerimeter();
    }

    // Private methods
    // -------------------------------
    private void calculateArea() {
        area = (Math.sqrt(3)/4) * (side * side);
    }

    private void calculatePerimeter() {
        perimeter = 3 * side;
    }
}
