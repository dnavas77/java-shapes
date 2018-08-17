public class Main {
  public static void main(String[] args) {
    // Circle
    Circle circle = new Circle(3);
    System.out.println("Circle:");
    System.out.println("Area: " + circle.getArea());
    System.out.println("Perimeter: " + circle.getPerimeter());
    circle.resize(2.0f);
    System.out.println("Area after resize: " + circle.getArea());
    System.out.println();

    // Equilateral triangle
    EquilateralTriangle et = new EquilateralTriangle(3.0);
    System.out.println("Equilateral Triangle:");
    System.out.println("Area: " + et.getArea());
    System.out.println("Perimeter: " + et.getPerimeter());
    et.resize(2.0f);
    System.out.println("Area after resize: " + et.getArea());
    System.out.println();

    // Right triangle
    RightTriangle rt = new RightTriangle(3.3, 5.6);
    System.out.println("Right Triangle:");
    System.out.println("Area: " + rt.getArea());
    System.out.println("Perimeter: " + rt.getPerimeter());
    rt.resize(2.0f);
    System.out.println("Area after resize: " + rt.getArea());
    System.out.println();

    // Rectangle
    Rectangle rect = new Rectangle(8, 9);
    System.out.println("Rectangle:");
    System.out.println("Area: " + rect.getArea());
    System.out.println("Perimeter: " + rect.getPerimeter());
    rect.resize(2.0f);
    System.out.println("Area after resize: " + rect.getArea());
    System.out.println();

    // Square
    Square sqr = new Square(8);
    System.out.println("Square:");
    System.out.println("Area: " + sqr.getArea());
    System.out.println("Perimeter: " + sqr.getPerimeter());
    sqr.resize(2.0f);
    System.out.println("Area after resize: " + sqr.getArea());
    System.out.println();

    // Parallelogram
    Parallelogram par = new Parallelogram(5, 4, 35);
    System.out.println("Parallelogram:");
    System.out.println("Area: " + par.getArea());
    System.out.println("Perimeter: " + par.getPerimeter());
    par.resize(2.0f);
    System.out.println("Area after resize: " + par.getArea());
    System.out.println();
  }
}
