public class RightTriangle implements ITriangle {
    // Fields
    // -------------------------------
    private double legA, legB, hypotenuse, area, perimeter;

    // Public methods
    // -------------------------------
    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
        this.hypotenuse = Math.sqrt(Math.pow(legA,2) + Math.pow(legB,2));
        calculateArea();
        calculatePerimeter();
    }

    public double getLegA() {
        return legA;
    }

    public void setLegA(double legA) {
        this.legA = legA;
    }

    public double getLegB() {
        return legB;
    }

    public void setLegB(double legB) {
        this.legB = legB;
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
        this.legA = factor * legA;
        this.legB = factor * legB;
        this.hypotenuse = factor * hypotenuse;
        calculateArea();
        calculatePerimeter();
    }

    // Overrides
    // -------------------------------
    private void calculateArea() {
        area = 0.5 * legA * legB;
    }

    private void calculatePerimeter() {
        perimeter = legA + legB + hypotenuse;
    }
}
