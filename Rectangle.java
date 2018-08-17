public class Rectangle implements IQuadrilateral {
    // Fields
    // -------------------------------
    private double length, width, area, perimeter;

    // Public methods
    // -------------------------------
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
    }

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
        this.length = length;
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
		setLength(factor * length);
		setWidth(factor * width);
        calculateArea();
        calculatePerimeter();
	}

    // Private methods
    // -------------------------------
    private void calculateArea() {
        area = length * width;
    }

    private void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }
}
