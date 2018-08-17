public class Parallelogram implements IQuadrilateral {
    // Fields
    // -------------------------------
    private double breadth, height, angle, area, perimeter;

    // Public methods
    // -------------------------------
    public Parallelogram(double breadth, double height, double angle) {
        this.breadth = breadth;
        this.height = height;
        this.angle = angle;
        calculateArea();
        calculatePerimeter();
    }

    public double getHeight() {
        return height;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
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
        this.breadth = factor * breadth;
        this.height = factor * height;
        calculateArea();
        calculatePerimeter();
    }

    // Private methods
    // -------------------------------
    private void calculateArea() {
        area = breadth * height * Math.sin(Math.toRadians(angle));
    }

    private void calculatePerimeter() {
        perimeter = 2 * (breadth + height);
    }
}
