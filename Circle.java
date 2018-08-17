public class Circle implements IShape {
    // Fields
    // --------------------------------
    private double radius, area, perimeter;

    // Public methods
    // --------------------------------
    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Overrides
    // --------------------------------
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
        this.radius = radius * factor;
        calculateArea();
        calculatePerimeter();
    }

    // Private methods
    // --------------------------------
    private void calculateArea() {
        area = Math.pow(radius, 2) * Math.PI;
    }

    private void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }
}
