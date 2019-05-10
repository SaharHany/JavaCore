public class Rectangle extends Shape
{
	double width;
	double length;
	public Rectangle()
	{
		width  = 0;
		length = 0;
	}
	
	public Rectangle(double w , double l)
	{
		width  = w;
		length = l;
	}
	
	public void draw()
	{
		System.out.println("The shape is Rectangle:");
		System.out.println("Width = "+width+" , Length = "+length);
	}
}