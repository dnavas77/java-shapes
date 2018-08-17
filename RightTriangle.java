public class RightTriangle implements ITriangle {
    private double legA, legB, hypotenuse;

    public RightTriangle(double legA, double legB) {
        this.legA = legA;
        this.legB = legB;
        this.hypotenuse = Math.sqrt(Math.pow(legA,2) + Math.pow(legB,2));
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

    @Override
    public double getArea() {
        return 0.5 * legA * legB;
    }

    @Override
    public double getPerimeter() {
        return legA + legB + hypotenuse;
    }

    @Override
    public void resize(float factor) {
        this.legA = factor * legA;
        this.legB = factor * legB;
        this.hypotenuse = factor * hypotenuse;
    }
}
