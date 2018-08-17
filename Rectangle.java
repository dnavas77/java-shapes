public class Rectangle implements IQuadrilateral {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getPerimeter() {
		return 2 * (length + width);
	}

	@Override
	public void resize(float factor) {
		setLength(factor * length);
		setWidth(factor * width);
	}
}
