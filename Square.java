public class Square implements IQuadrilateral {
    // Fields
    // -------------------------------
    private double length, area, perimeter;

    // Public methods
    // -------------------------------
    public Square(double length) {
        this.length = length;
        calculateArea();
        calculatePerimeter();
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
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
        this.length = factor * length;
        calculateArea();
        calculatePerimeter();
    }

    // Private methods
    // -------------------------------
    private void calculateArea() {
        area = length * length;
    }

    private void calculatePerimeter() {
        perimeter = 4 * length;
    }
}
