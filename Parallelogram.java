public class Parallelogram implements IQuadrilateral {
    private double breadth, height, angle;

    public Parallelogram(double breadth, double height, double angle) {
        this.breadth = breadth;
        this.height = height;
        this.angle = angle;
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

    @Override
    public double getArea() {
        return breadth * height * Math.sin(Math.toRadians(angle));
    }

    @Override
    public double getPerimeter() {
        return 2 * (breadth + height);
    }

    @Override
    public void resize(float factor) {
        this.breadth = factor * breadth;
        this.height = factor * height;
    }
}
