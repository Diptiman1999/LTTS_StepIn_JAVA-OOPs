
public abstract class Shape {
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	abstract void calculateArea(int value);
}

class Circle extends Shape
{
	public void calculateArea(int value)
	{
		double area = 3.14*value*value;
		System.out.println("Area of circle is: "+area);
	}
}

class Square extends Shape
{
	public void calculateArea(int value)
	{
		double area = value * value;
		System.out.println("Area of Square is: "+area);

	}
}